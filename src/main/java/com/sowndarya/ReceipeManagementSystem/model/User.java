package com.sowndarya.ReceipeManagementSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long userId;

    private String userName;
    @NotEmpty
    private String password;
    @Email
    private String email;

    @ManyToOne
    @JoinColumn(nullable = false , name = "fk_admin_id")
    private PremiumRole role;

    public User(String userName ,String password, String email, PremiumRole role) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.role = role;
    }
}
