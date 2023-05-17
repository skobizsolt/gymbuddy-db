package com.gymbuddy.db.persistence.entity.enums;

import lombok.Getter;

/**
 * Enum class for Auth Roles.
 */
@Getter
public enum AuthRoles {
    USER("User"),
    ADMIN("Admin");

    final String role;

    AuthRoles(String role) {
        this.role = role;
    }
}
