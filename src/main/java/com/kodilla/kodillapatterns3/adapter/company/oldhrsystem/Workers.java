package com.kodilla.kodillapatterns3.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"67022312345","John", "Smith"},
            {"62081612345", "Ivone", "Novak"},
            {"73121012345", "Jessie", "Pinkman"},
            {"75100498765", "Walter", "White"},
            {"76080856789", "Clara", "Larson"}};
    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};
    public String gerWorker(int n ) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
