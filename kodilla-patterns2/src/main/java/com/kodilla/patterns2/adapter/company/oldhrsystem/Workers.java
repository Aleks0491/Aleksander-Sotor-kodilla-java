package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"67032906720", "John", "Smith"},
            {"62080112187", "Ivone", "Novak"},
            {"75121223654", "Jessie", "Pinkman"},
            {"65112245789", "Walter", "White"},
            {"54051622852", "Clara", "Lanson"}
    };

    private double[] salaries = {
            4500.00,
            6700.00,
            4350.00,
            9000.00,
            6200.00
    };

    public String getWorkers(int n) {
        if(n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " +salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
