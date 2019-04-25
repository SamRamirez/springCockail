package com.excilys.sramirez.spring.formation.cocktailback.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excilys.sramirez.spring.formation.cocktailback.model.Ingredient;
import com.excilys.sramirez.spring.formation.cocktailback.service.IngredientService;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

	IngredientService ingredientService;
	
	public IngredientController(IngredientService ingredientService) {
		super();
		this.ingredientService = ingredientService;
	}

	@GetMapping("/")
	public List<Ingredient> getAll(){
		return ingredientService.getAll();	
	}
	
	@PostMapping("/")
	public Long create(@RequestBody Ingredient ingredient) {
		return ingredientService.create(ingredient);
	}
	
	@GetMapping("/id")
	public Ingredient getById(Long id) {
		return ingredientService.getById(id);
		
	}
	
}
