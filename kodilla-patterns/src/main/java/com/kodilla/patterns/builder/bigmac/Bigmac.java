package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final Buns buns;
    private final int burgers;
    private final Sauce sauce;
    private final List<Ingredients> ingredients;

    public static class BigmacBuilder {
        private Buns buns;
        private int burgers;
        private String sauce;
        private List<Ingredients> ingredients = new ArrayList<>();

        public BigmacBuilder buns (Buns buns) {
            this.buns = buns;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredients(Ingredients ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(buns, burgers, new Sauce(sauce), ingredients);
        }
    }

    private Bigmac(Buns buns, int burgers, Sauce sauce, List<Ingredients> ingredients) {
        this.buns = buns;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public Buns getBuns() {
        return buns;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                ", buns='" + buns + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
