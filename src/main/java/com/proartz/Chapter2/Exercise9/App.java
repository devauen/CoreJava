package com.proartz.Chapter2.Exercise9;

public class App {

    public static void main(String[] args) {

        /*
        Klasa Car powinna być modyfikowalna, ponieważ potrzebujemy przechowywać stan pojazdu.
         */
        Car porshe = new Car(10.0);
        System.out.println(porshe);

        porshe.tank(40);
        System.out.println(porshe);

        porshe.drive(40.0);
        System.out.println(porshe);

        porshe.drive(100.0);
        System.out.println(porshe);

    }
}
