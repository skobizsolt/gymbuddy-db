package com.gymbuddy.db.persistence.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Entity class for Step records.
 */
@Entity(name = "step_record")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class StepRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long recordId;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "sessionId", referencedColumnName = "sessionId")
    WorkoutSession sessionId;
    @NotNull
    Long stepId;
    @NotNull
    LocalDateTime completedAt;
    @NotNull
    BigDecimal duration;
}
