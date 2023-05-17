package com.gymbuddy.db.persistence.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Embeddable
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WorkoutStepId {
    @NotNull Long stepId;
    @ManyToOne
    @JoinColumn(name = "workoutId", referencedColumnName = "workoutId")
    @NotNull Workout workoutId;
}
