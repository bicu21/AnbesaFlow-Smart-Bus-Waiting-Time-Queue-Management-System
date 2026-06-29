package com.anbesaflow.auth.service;

import com.anbesaflow.auth.dto.*;
import com.anbesaflow.auth.entity.User;
import com.anbesaflow.auth.exception.UserAlreadyExistsException;
import com.anbesaflow.auth.repository.UserRepository;
import com.anbesaflow.auth.security.JwtTokenProvider;
import com.anbesaflow.auth.security.TokenBlacklistService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;

@Service
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider tokenProvider;
    private final TokenBlacklistService blacklistService;
    private final String jwtPrefix;

    public AuthService(
            AuthenticationManager authenticationManager,
            UserRepository userRepository,
            PasswordEncoder passwordEncoder,
            JwtTokenProvider tokenProvider,
            TokenBlacklistService blacklistService,
            @Value("${app.jwt.prefix}") String jwtPrefix) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.tokenProvider = tokenProvider;
        this.blacklistService = blacklistService;
        this.jwtPrefix = jwtPrefix;
    }

    @Transactional
    public UserResponse register(RegisterRequest request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new UserAlreadyExistsException("Email address '" + request.getEmail() + "' is already registered");
        }

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        // Hash password before saving
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(request.getRole());

        User savedUser = userRepository.save(user);
        return UserResponse.fromUser(savedUser);
    }

    @Transactional(readOnly = true)
    public AuthResponse login(LoginRequest request) {
        // Authenticate the credentials
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
        );

        // Store authentication context
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // Generate JWT token
        String jwt = tokenProvider.generateToken(authentication);

        // Fetch user info for DTO mapping
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new IllegalStateException("Authenticated user not found in database"));

        return new AuthResponse(jwt, UserResponse.fromUser(user));
    }

    public void logout(String authHeader) {
        if (StringUtils.hasText(authHeader) && authHeader.startsWith(jwtPrefix)) {
            String jwt = authHeader.substring(jwtPrefix.length());

            if (tokenProvider.validateToken(jwt)) {
                // Retrieve token expiration and add to blacklist
                Date expiration = tokenProvider.getExpirationFromJWT(jwt);
                blacklistService.blacklistToken(jwt, expiration);
            }
        }
        // Invalidate current context
        SecurityContextHolder.clearContext();
    }
}
