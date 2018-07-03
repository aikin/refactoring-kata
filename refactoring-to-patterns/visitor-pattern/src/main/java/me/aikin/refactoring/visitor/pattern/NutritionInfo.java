package me.aikin.refactoring.visitor.pattern;

public class NutritionInfo {
    private int healthRating;
    private int calory;
    private Double protein;

    public NutritionInfo(int healthRating, int calory, Double protein) {
        this.healthRating = healthRating;
        this.calory = calory;
        this.protein = protein;
    }

    public int getHealthRating() {
        return healthRating;
    }

    public void setHealthRating(int healthRating) {
        this.healthRating = healthRating;
    }

    public int getCalory() {
        return calory;
    }

    public void setCalory(int calory) {
        this.calory = calory;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }
}
