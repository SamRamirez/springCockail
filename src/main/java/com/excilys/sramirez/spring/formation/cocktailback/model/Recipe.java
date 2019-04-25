package com.excilys.sramirez.spring.formation.cocktailback.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "RECIPEEE")
public class Recipe {

	Long id;
	String name;
	String picture;
	String description;
	Set<RecipeIngredient> recipeIngredient;
	Set<String> instructions;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Column(name = "piture")
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	
	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@OneToMany
	public Set<RecipeIngredient> getRecipeIngredient() {
		return recipeIngredient;
	}
	public void setRecipeIngredient(Set<RecipeIngredient> recipeIngredient) {
		this.recipeIngredient = recipeIngredient;
	}
	
	
	@Column(name = "instructions")
	@ElementCollection(targetClass=String.class)
	public Set<String> getInstructions() {
		return instructions;
	}
	public void setInstructions(Set<String> instructions) {
		this.instructions = instructions;
	}
	
}
