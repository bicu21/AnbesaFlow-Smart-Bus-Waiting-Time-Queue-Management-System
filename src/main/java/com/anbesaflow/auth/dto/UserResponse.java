package com.anbesaflow.auth.dto;

import com.anbesaflow.auth.entity.Role;
import com.anbesaflow.auth.entity.User;

public class UserResponse {

    private Long id;
    private String name;
    private String email;
    private Role role;

    // Constructors
    public UserResponse() {
    }

    public UserResponse(Long id, String name, String email, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    // Static Mapper
    public static UserResponse fromUser(User user) {
        if (user == null) return null;
        return new UserResponse(user.getId(), user.getName(), user.getEmail(), user.getRole());
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
