package com.gymbuddy.db.persistence.entity.enums;

import lombok.Getter;

/**
 * Enum that represents the type of the workout.
 */
@Getter
public enum WorkoutType {
    INTERVAL("Interval"),
    REP("Rep");

    final String name;

    WorkoutType(String name) {
        this.name = name;
    }
}
