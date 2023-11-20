package com.gymbuddy.db.persistence.entity;

import com.gymbuddy.db.persistence.entity.enums.WorkoutSessionStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

/**
 * Entity class for Step records.
 */
@Entity(name = "session")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class WorkoutSession {
    @Id
    @NotNull
    String sessionId;
    Long workoutId;
    @NotNull
    String userId;
    @NotNull LocalDateTime createdAt;
    LocalDateTime completedAt;
    @Enumerated(value = EnumType.STRING)
    WorkoutSessionStatus status;
}
