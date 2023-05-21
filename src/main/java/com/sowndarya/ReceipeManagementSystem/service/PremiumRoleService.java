package com.sowndarya.ReceipeManagementSystem.service;

import com.sowndarya.ReceipeManagementSystem.model.PremiumRole;
import com.sowndarya.ReceipeManagementSystem.repository.IPremiumRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class PremiumRoleService {

    @Autowired
    IPremiumRoleRepo roleRepo;

    @Autowired
    HeadAdminService adminService;

    public String createRole(PremiumRole role , String email){
        if(adminService.isValidEmail(email)){
            roleRepo.save(role);
            return "Premium role created successfully....";
        }else
            return "You don't have the access to create premium roles..";
    }


}
