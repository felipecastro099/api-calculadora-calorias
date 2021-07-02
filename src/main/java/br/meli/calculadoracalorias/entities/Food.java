package br.meli.calculadoracalorias.entities;

import java.util.List;

public class Food {
    private Integer id;
    private String name;
    private Double calories;
    private List<Ingredient> ingredients;

    public Food(Integer id, String name, Double calories, List<Ingredient> ingredients) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.ingredients = ingredients;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
