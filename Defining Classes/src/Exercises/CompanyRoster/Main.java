package Exercises.CompanyRoster;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Department> departments = new HashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String employeeData = scanner.nextLine();
            String[] parameters = employeeData.split("\\s+");
            String name = parameters[0];
            double salary = Double.parseDouble(parameters[1]);
            String position = parameters[2];
            String department = parameters[3];
            Employee employee = null;
            if (parameters.length == 6) {
                String email = parameters[4];
                int age = Integer.parseInt(parameters[5]);
                employee = new Employee(name, salary, position, department, email, age);
            } else if (parameters.length == 5) {
                String fourthParameter = parameters[4];
                try {
                    int age = Integer.parseInt(fourthParameter);
                    employee = new Employee(name, salary, position, department, age);
                } catch (NumberFormatException e) {
                    String email = fourthParameter;
                    employee = new Employee(name, salary, position, department, email);
                }

            } else if (parameters.length == 4) {
                employee = new Employee(name, salary, position, department);
            }
            if (!departments.containsKey(department)) {
                departments.put(department, new Department(department));
            }
            departments.get(department).getEmployees().add(employee);
        }
        Department maxAvSalaryDep = departments.entrySet()
                .stream()
                .max(Comparator.comparingDouble(entry -> entry.getValue().getAverageSalary()))
                .get()
                .getValue();
        System.out.println("Highest Average Salary: " + maxAvSalaryDep.getName());
        maxAvSalaryDep.getEmployees()
                .stream()
                .sorted((employee1, employee2) -> Double.compare(employee2.getSalary(), employee1.getSalary()))
                .forEach(employee -> System.out.println(employee.toString()));
    }
}