package com.gymbuddy.db.persistence.entity.enums;

import lombok.Getter;

/**
 * Enum class for Auth Token Types.
 */
@Getter
public enum TokenType {
    VERIFY("VERIFY"),
    PASSWORD("PASSWORD");

    final String type;

    TokenType(String type) {
        this.type = type;
    }
}
