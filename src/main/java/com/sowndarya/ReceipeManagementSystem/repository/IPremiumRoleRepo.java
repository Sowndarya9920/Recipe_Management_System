package com.sowndarya.ReceipeManagementSystem.repository;

import com.sowndarya.ReceipeManagementSystem.model.PremiumRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPremiumRoleRepo extends JpaRepository<PremiumRole,Long> {
}
