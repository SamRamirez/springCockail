package com.excilys.sramirez.spring.formation.cocktailback.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.*;
import org.springframework.stereotype.Repository;

import com.excilys.sramirez.spring.formation.cocktailback.model.Ingredient;

@Repository
public class IngredientDAO {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public Long create(Ingredient ingredient) {
		Session session = entityManager.unwrap(Session.class);
		session.save(ingredient);
		return ingredient.getId();
	}
	
	public Ingredient getById(Long id) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(Ingredient.class, id);
	}

	public List<Ingredient> getAll() {
		return entityManager.createQuery("from Ingredient", Ingredient.class).getResultList();	 
	}
	

}
