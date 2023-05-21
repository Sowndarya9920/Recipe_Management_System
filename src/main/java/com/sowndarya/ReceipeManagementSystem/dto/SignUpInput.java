package com.sowndarya.ReceipeManagementSystem.dto;

import com.sowndarya.ReceipeManagementSystem.model.PremiumRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpInput {
    private String userName;
    private String password;
    private String email;
    private PremiumRole role;
}
