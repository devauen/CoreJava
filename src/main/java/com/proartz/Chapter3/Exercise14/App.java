package com.proartz.Chapter3.Exercise14;

import com.proartz.Chapter3.Exercise1.*;

import java.util.Arrays;
import java.util.Comparator;

import static com.proartz.Chapter3.Exercise1.App.createEmployees;
import static com.proartz.Chapter3.Exercise1.App.printList;

public class App {

    public static void main(String[] args) {

        Employee[] employees = createEmployees(10);

        printList(employees);

        Arrays.sort(employees, Comparator
                .comparingDouble(Employee::getSalary)
                .thenComparing(Employee::getName));

        System.out.println();
        printList(employees);

    }

}
