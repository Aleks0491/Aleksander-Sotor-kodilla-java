package com.kodilla.patterns.builder.bigmac;

public enum Buns {
    SESAM("With sesame"),
    NOSESAM("Without sesame");

    private String name;

    Buns(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;

    }
}
