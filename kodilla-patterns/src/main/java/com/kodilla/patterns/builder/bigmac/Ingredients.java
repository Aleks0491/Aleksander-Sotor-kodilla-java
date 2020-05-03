package com.kodilla.patterns.builder.bigmac;

public class Ingredients {
    public final static String LETTUCE = "Lettuce";
    public final static String ONION = "Onion";
    public final static String BACON = "Bacon";
    public final static String CUCUMBER = "Cucumber";
    public final static String CHILLIPEPPER = "Chilli pepper";
    public final static String MUSHROOMS = "Mushrooms";
    public final static String SHRIMP = "Shrimp";
    public final static String CHEESE = "Cheese";
    private String ingredient;

    public Ingredients(String ingredients) {
        if (ingredients.equals(LETTUCE)
                || ingredients.equals(ONION)
                || ingredients.equals(BACON)
                || ingredients.equals(CUCUMBER)
                || ingredients.equals(CHILLIPEPPER)
                || ingredients.equals(MUSHROOMS)
                || ingredients.equals(SHRIMP)
                || ingredients.equals(CHEESE)) {
            this.ingredient = ingredients;
        } else {
            throw new IllegalStateException("There is no such ingredient.");
        }
    }

    public String getIngredient() {
        return ingredient;
    }
}
