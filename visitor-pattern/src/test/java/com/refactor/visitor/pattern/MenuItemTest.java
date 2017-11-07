package com.refactor.visitor.pattern;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MenuItemTest {
    private static Ingredient flour = CreateFlour();
    private static Ingredient yolk = CreateYolk();
    private static MenuItem moonCake = CreateMoonCake();

    @Test
    public void should_calc_health_rating_Ingredient() {
        assertEquals(1, flour.getHealthRating());
    }

    @Test
    public void should_calc_protein_for_Ingredient() {
        assertEquals("100.0 g", flour.getProtein());
    }

    @Test
    public void should_calc_calory_for_Ingredient() {
        assertEquals("10 J", flour.getCalory());
    }

    @Test
    public void should_calc_health_rating_for_MenuItem() {
        assertEquals(2, moonCake.getHealthRating().size());
        assertTrue(moonCake.getHealthRating().contains(1));
        assertTrue(moonCake.getHealthRating().contains(2));
    }

    @Test
    public void should_calc_protein_for_MenuItem() {
        assertEquals(2, moonCake.getProtein().size());
        assertTrue(moonCake.getProtein().contains("100.0 g"));
        assertTrue(moonCake.getProtein().contains("200.0 g"));
    }

    @Test
    public void should_calc_calory_for_MenuItem() {
        assertEquals(3, moonCake.getCalory().size());
        assertTrue(moonCake.getCalory().contains("10 J"));
        assertTrue(moonCake.getCalory().contains("20 J"));
        assertTrue(moonCake.getCalory().contains("Cooking will double calories!!!"));
    }

    private static Ingredient CreateFlour() {
        NutritionInfo nutrition = new NutritionInfo(1, 10, 100d);
        return new Ingredient(nutrition);
    }

    private static Ingredient CreateYolk() {
        NutritionInfo nutrition = new NutritionInfo(2, 20, 200d);

        return new Ingredient(nutrition);
    }

    private static MenuItem CreateMoonCake() {
        List<Ingredient> ingredients = Arrays.asList(flour, yolk);
        MenuItem menuItem = new MenuItem(ingredients);
        return menuItem;
    }
}