package com.anbesaflow.auth.security;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class TokenBlacklistService {

    // Map to store blacklisted token as key and its expiration Date as value
    private final Map<String, Date> blacklist = new ConcurrentHashMap<>();

    /**
     * Blacklist a token.
     *
     * @param token the JWT token to blacklist
     * @param expiryDate the token expiration date
     */
    public void blacklistToken(String token, Date expiryDate) {
        if (token != null && expiryDate != null) {
            blacklist.put(token, expiryDate);
        }
    }

    /**
     * Check if a token is blacklisted.
     *
     * @param token the JWT token
     * @return true if the token is blacklisted, false otherwise
     */
    public boolean isBlacklisted(String token) {
        if (token == null) {
            return false;
        }
        Date expiryDate = blacklist.get(token);
        if (expiryDate == null) {
            return false;
        }
        // If the current date is after the expiration, it's expired (cleanup will remove it anyway)
        if (new Date().after(expiryDate)) {
            blacklist.remove(token);
            return false;
        }
        return true;
    }

    /**
     * Cleanup expired tokens from the blacklist map.
     * Runs every hour (3600000 ms) in the background.
     */
    @Scheduled(fixedRate = 3600000)
    public void cleanExpiredTokens() {
        Date now = new Date();
        blacklist.entrySet().removeIf(entry -> now.after(entry.getValue()));
    }
}
