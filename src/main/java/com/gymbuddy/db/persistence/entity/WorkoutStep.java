package com.gymbuddy.db.persistence.entity;

import com.gymbuddy.db.persistence.entity.enums.WorkoutType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/**
 * Entity class that represents steps of the created workout.
 */
@Entity(name = "workout_step")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WorkoutStep {
    @EmbeddedId WorkoutStepId workoutStepId;
    @NotNull Integer stepPosition;
    @NotNull String stepName;
    @Column(columnDefinition = "TEXT")
    String details;
    @Enumerated(value = EnumType.STRING)
    @NotNull WorkoutType workoutType;
    @NotNull Integer estimatedTime;
}
