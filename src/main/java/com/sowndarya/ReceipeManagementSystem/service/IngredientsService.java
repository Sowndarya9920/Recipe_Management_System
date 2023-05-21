package com.sowndarya.ReceipeManagementSystem.service;

import com.sowndarya.ReceipeManagementSystem.model.AuthenticationToken;
import com.sowndarya.ReceipeManagementSystem.model.Ingredients;
import com.sowndarya.ReceipeManagementSystem.model.ProcessStatus;
import com.sowndarya.ReceipeManagementSystem.model.Recipe;
import com.sowndarya.ReceipeManagementSystem.repository.IIngredientsRepo;
import com.sowndarya.ReceipeManagementSystem.repository.IPremiumRoleRepo;
import com.sowndarya.ReceipeManagementSystem.repository.IRecipeRepo;
import com.sowndarya.ReceipeManagementSystem.repository.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientsService {
    @Autowired
    IIngredientsRepo iRepo;


    @Autowired
    ITokenRepo tokenRepo;
    public void createIngredients(List<Ingredients> ingredients, String token) {
        AuthenticationToken generatedToken = tokenRepo.findFirstByToken(token);
        if(generatedToken.getUser().getRole().getRoleId()==1){
            iRepo.saveAll(ingredients);
        }
    }

    public List<Ingredients> getIngredients(String email, String token) {
        AuthenticationToken generatedToken = tokenRepo.findFirstByToken(token);
        return iRepo.findAll();
    }

    public void deleteIngredients(Long id, String token) {
        AuthenticationToken generatedToken = tokenRepo.findFirstByToken(token);
        if(generatedToken.getUser().getRole().getRoleId()==1){
            iRepo.deleteById(id);
        }
    }
}
