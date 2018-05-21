package com.kodilla.kodillapatterns3.adapter.company;

import com.kodilla.kodillapatterns3.adapter.company.oldhrsystem.Workers;
import org.junit.Assert;
import org.junit.Test;

public class SalaryAdapterTestSuite {
    @Test
    public void testTotalSalary() {
        //Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();
        //When
        double tottalSalary = salaryAdapter.totalSalary(workers.getWorkers(), workers.getSalaries());
        //Then
        System.out.println(tottalSalary);
        Assert.assertEquals(tottalSalary, 27750, 0 );
    }
}
