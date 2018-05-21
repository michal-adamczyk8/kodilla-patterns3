package com.kodilla.kodillapatterns3.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    private final String pesel;
    private final String firstName;
    private final String lastName;
    private final BigDecimal baseSalary;

    public Employee(String pesel, String firstName, String lastName, BigDecimal baseSalary) {
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public String getPesel() {
        return pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return pesel != null ? pesel.equals(employee.pesel) : employee.pesel == null;
    }

    @Override
    public int hashCode() {
        return pesel != null ? pesel.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "pesel='" + pesel + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }


}
