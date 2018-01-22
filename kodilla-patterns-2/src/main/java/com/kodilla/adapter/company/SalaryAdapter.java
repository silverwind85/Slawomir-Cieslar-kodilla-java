package com.kodilla.adapter.company;

import com.kodilla.adapter.company.newhrsystem.Employee;
import com.kodilla.adapter.company.oldhrsystem.SalaryCalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalaryAdapter extends SalaryAdaptee implements SalaryCalculator{
    @Override
    public double TotalSalary(String[][] workers, double[] salaries) {
        List<Employee> employees = new ArrayList<>();
        for(int n = 0; n<salaries.length; n++){
            employees.add(new Employee(
                    workers[n][0],
                    workers[n][1],
                    workers[n][2],
                    new BigDecimal(salaries[n])));
        }
        return calculateSalaries(employees).doubleValue();
    }
}
