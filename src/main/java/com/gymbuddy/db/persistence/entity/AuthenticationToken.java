package com.gymbuddy.db.persistence.entity;

import com.gymbuddy.db.persistence.entity.enums.TokenType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity(name = "auth_token")
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationToken {

    private static final int EXPIRATION = 60 * 24;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;
    private String token;
    private Date expiryDate;
    @Enumerated(EnumType.STRING)
    private TokenType tokenType;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId",
            referencedColumnName = "userId",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_USER_TOKEN"))
    private User user;
}
