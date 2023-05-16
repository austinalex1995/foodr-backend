package com.backend.foodr.service;

import com.backend.foodr.model.Recipe;
import com.backend.foodr.repository.RecipeRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RecipeService {

    /**
     *
     * Member Variables
     *
     */

    private RecipeRepository recipeRepository;



    /**
     *
     * Constructor
     *
     */

    public RecipeService(RecipeRepository recipeRepository) {

        this.recipeRepository = recipeRepository;

    }



    /**
     *
     * Class Methods
     *
     */

    public List<Recipe> findAllRecipe() {

        return this.recipeRepository.findAll();

    }

    public Optional<Recipe> findRecipeById(Long id) {

        return this.recipeRepository.findById(id);

    }

    public Recipe save(Recipe recipe) {

        return this.recipeRepository.save(recipe);

    }

}
