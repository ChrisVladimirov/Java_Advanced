package Exercises.CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private final String name;
    private final List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public double getAverageSalary() {
        /*
        int sumSalaries = 0;
         for (Employee employee : employees) {
             sumSalaries += employee.getSalary();
         }
         return sumSalaries / employees.size();
        */
        return this.employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public String getName() {
        return this.name;
    }
}