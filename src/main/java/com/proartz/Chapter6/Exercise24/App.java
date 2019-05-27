package com.proartz.Chapter6.Exercise24;

public class App {

    public static void main(String[] args) throws ReflectiveOperationException{

//        Class<?> cl = Class.forName("java.lang.String");
//        String newString = cl.newInstance();
//        String secondString = cl.cast(new Object());
//
//        System.out.println("newString class is: " + newString.getClass());
            /*
            * Bez rzutowania zmiennej typu Class<?> nie mogę wywołać metody newInstance()
            * oraz metody cast(), przy próbie zapisania wyniku tych metod do zmiennej typu
            * innego niż Object, ponieważ zwracają one bezpośrednio typ T
            * */
    }

}
