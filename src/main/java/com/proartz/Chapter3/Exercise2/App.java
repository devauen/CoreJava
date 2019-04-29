package com.proartz.Chapter3.Exercise2;

import com.proartz.Chapter3.Exercise1.Employee;
import com.proartz.Chapter3.Exercise1.Measurable;

import java.util.Arrays;

import static com.proartz.Chapter3.Exercise1.App.*;

public class App {

    public static void main(String[] args) {

        Employee[] employees = createEmployers(10);
        printList(employees);
        Employee richestEmployee = (Employee)largest(employees);
        System.out.printf("Largest salary: %s%n", richestEmployee.getName());

    }

    public static Measurable largest(Measurable[] objects) {
        Arrays.sort(objects,
                (first, second)-> (int)(first.getMeasure() - second.getMeasure()));

        return objects[objects.length - 1];
    }
}
