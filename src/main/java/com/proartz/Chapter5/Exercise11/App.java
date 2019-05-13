package com.proartz.Chapter5.Exercise11;

import java.util.Objects;

public class App {

    public static void main(String[] args) {

        /*
        * Objects.requireNonNull(obj) wyrzuca wyjątek NullPointerException, który można przechwycić
        * i obsłużyć. Dodatkowo dostarcza jasną informację o wystąpieniu tego wyjątku.
        *
        * assert obj != null musi być uruchomione z flagą -ea oraz powoduje błąd assercji i
        * przerwanie działania programu.
        * */

        Object obj1 = null; //new Integer(0);

        Objects.requireNonNull(obj1);
        System.out.println("requireNonNull");

        Object obj2 = null;

        assert obj2 != null : "Tekst"; //new Exception("Blabalbabla");
        System.out.println("assert");

    }

}
