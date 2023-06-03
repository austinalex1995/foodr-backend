package com.backend.foodr.controller;

import com.backend.foodr.model.Recipe;
import com.backend.foodr.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins ={"http://localhost:4200", "http://localhost:3000"}, allowCredentials = "true")
public class RecipeController {

    /**
     *
     * Member Variables
     *
     */

    RecipeService recipeService;



    /**
     *
     * Constructor
     *
     */

    @Autowired
    public RecipeController(RecipeService recipeService) {

        this.recipeService = recipeService;

    }



    /**
     *
     * Class Methods
     *
     */

    @GetMapping("recipe")
    public List<Recipe> getAllRecipe() {

        return this.recipeService.findAllRecipe();

    }

    @GetMapping("recipe/{id}")
    public Optional<Recipe> getRecipeById(@PathVariable("id") long id) {

        return this.recipeService.findRecipeById(id);

    }

    @PostMapping("recipe")
    public Recipe save(@RequestBody Recipe recipe) {

        return this.recipeService.save(recipe);

    }

    @GetMapping("recipe/createdby/{id}")
    public List<Recipe> getRecipesByCreatedby(@PathVariable("id") long id) {

        return this.recipeService.findByCreatedBy(id);

    }

}
