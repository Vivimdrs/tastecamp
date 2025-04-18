package com.tastecamp.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @GetMapping
    public String getRecipes(){
        return "Lista";
    }

    @GetMapping("/{id}")
    public String getRecipeById(@PathVariable long id){
        return "Essa receita é " + id;
    }

    @PostMapping
    public String createRecipe(@RequestBody String body){
        return body;
    }

}
