package com.sowndarya.ReceipeManagementSystem.controller;

import com.sowndarya.ReceipeManagementSystem.model.ProcessStatus;
import com.sowndarya.ReceipeManagementSystem.model.Recipe;
import com.sowndarya.ReceipeManagementSystem.service.RecipeService;
import com.sowndarya.ReceipeManagementSystem.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {
    @Autowired
    RecipeService recipeService;

    @Autowired
    TokenService tokenService;

    @PostMapping("/recipe")
    public ResponseEntity<String> createRecipe(@RequestBody Recipe recipe, @RequestParam String email, @RequestParam String token) {
        HttpStatus status;
        String message;
        if (tokenService.authenticate(email, token)) {
            recipeService.createRecipe(recipe, token);
            message = "Recipe created successfully";
            status = HttpStatus.OK;
        } else {
            message = "Invalid user";
            status = HttpStatus.FORBIDDEN;
        }
        return new ResponseEntity<>(message, status);
    }

    @GetMapping("/recipe")
    public List<Recipe> getRecipe(@RequestParam String token, @RequestParam String email) {

        if (tokenService.authenticate(email, token)) {
            return recipeService.getRecipe(email, token);
        }
        return null;
    }

    @PutMapping("/recipe")
    public ResponseEntity<String> updateRecipe(@RequestBody ProcessStatus processStatus, @RequestParam String email, @RequestParam String token , @RequestParam Long id) {
        HttpStatus status;
        String message;
        if (tokenService.authenticate(email, token)) {
            recipeService.updateRecipe(processStatus, token , id);
            message = "Recipe updated successfully";
            status = HttpStatus.OK;
        } else {
            message = "Invalid user";
            status = HttpStatus.FORBIDDEN;
        }
        return new ResponseEntity<>(message, status);
    }
}