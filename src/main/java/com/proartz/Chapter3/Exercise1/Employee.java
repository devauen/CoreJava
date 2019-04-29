package com.proartz.Chapter3.Exercise1;

public class Employee implements Measurable {

    private static final double DEFAULT_SALARY = 4000.0;

    private static int id = 0;
    private String name;
    private double salary;


    public Employee() {
        this("Employee_" + id, DEFAULT_SALARY);
        id++;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
