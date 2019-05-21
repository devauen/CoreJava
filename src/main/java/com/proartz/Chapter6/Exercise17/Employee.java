package com.proartz.Chapter6.Exercise17;

public class Employee implements Comparable<Employee>{


    /*
    * Tworzona jest metoda pomostowa
    *
    *   public int compareTo(Object o)
    *
    * aby po wymazaniu typu klasy do
    *
    *   public class Employee implements Comparable
    *
    * przy odwołaniu do metody compareTo(), nie została użyta metoda compareTo() z klasy Object
    * tylko z klasy Employee. Metoda pommostowa wywołuje następnie metodę:
    *
    *   public int compareTo(Employee o)
    *
    * */

    private static final String DEFAULT_NAME = "Employee";
    private String name;

    public Employee() {
        this(DEFAULT_NAME);
    }

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.getName());
    }

    public String getName() {
        return name;
    }
}
