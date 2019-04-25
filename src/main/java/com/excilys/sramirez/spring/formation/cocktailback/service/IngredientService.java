package com.excilys.sramirez.spring.formation.cocktailback.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.excilys.sramirez.spring.formation.cocktailback.dao.IngredientDAO;
import com.excilys.sramirez.spring.formation.cocktailback.model.Ingredient;

@Service
public class IngredientService {
	
	public IngredientDAO ingredientDao;

	public Long create(Ingredient ingredient) {
		return ingredientDao.create(ingredient);
	}
	
	public IngredientService(IngredientDAO ingredientDao) {
		super();
		this.ingredientDao = ingredientDao;
	}

	public Ingredient getById(Long id) {
		return ingredientDao.getById(id);
	}
	
	public List<Ingredient> getAll(){
		return ingredientDao.getAll();
	}
	
}
