package com.proartz.Chapter3.Exercise1;

import java.util.Random;

public class App {

    private static Random random = new Random();

    public static void main(String[] args) {

        Employee[] employees = createEmployees(10);
        printList(employees);
        System.out.printf("Average of employees: %.2f%n", average(employees));

    }

    public static Employee[] createEmployees(int n) {
        Employee[] employees = new Employee[n];
        for(int i = 0; i < employees.length; i++) {
            employees[i] = new Employee(
                    "Employee_" + i,
                    random.nextInt(10)*1000);
        }

        return employees;
    }

    public static void printList(Employee[] employees) {
        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double average(Measurable[] objects) {

        double sum = 0;

        for(Measurable measurable : objects) {
            sum += measurable.getMeasure();
        }

        return sum / objects.length;
    }

}
