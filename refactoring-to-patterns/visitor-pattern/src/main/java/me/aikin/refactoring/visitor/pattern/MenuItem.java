package me.aikin.refactoring.visitor.pattern;

import java.util.List;
import java.util.stream.Collectors;

public class MenuItem {
    private List<Ingredient> ingredients;

    public MenuItem(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void AddToPot() {
    }

    public void AddWater() {
    }

    public void AddOil() {
    }

    public void Smell() {
    }

    public void Taste() {
    }

    public void Cook() {
    }

    public List<Integer> getHealthRating() {
        return ingredients.stream()
                .map(Ingredient::getHealthRating)
                .collect(Collectors.toList());
    }

    public List<String> getProtein() {
        return ingredients.stream()
                .map(Ingredient::getProtein)
                .collect(Collectors.toList());
    }

    public List<String> getCalory() {
        List<String> calories = ingredients.stream()
                .map(Ingredient::getCalory)
                .collect(Collectors.toList());
        calories.add("Cooking will double calories!!!");
        return calories;
    }
}
