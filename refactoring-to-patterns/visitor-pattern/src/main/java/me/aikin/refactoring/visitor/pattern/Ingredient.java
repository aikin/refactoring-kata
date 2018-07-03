package me.aikin.refactoring.visitor.pattern;

public class Ingredient {
    private NutritionInfo Nutrition;

    public Ingredient(NutritionInfo nutrition) {
        Nutrition = nutrition;
    }

    public void addToPot() {
    }

    public void addWater() {
    }

    public void addOil() {
    }

    public void smell() {
    }

    public int getHealthRating() {
        smell();
        return Nutrition.getHealthRating();
    }

    public String getProtein() {
        return Nutrition.getProtein() + " g";
    }

    public String getCalory() {
        return Nutrition.getCalory() + " J";
    }
}

