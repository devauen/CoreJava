package com.proartz.Chapter4.Exercise6;

public class App {

    public static void main(String[] args) {

        Item item = new Item("Pies", 10.0);
        DiscountedItem discountedItem1 = new DiscountedItem("Pies", 10.0, 10.0);
        DiscountedItem discountedItem2 = new DiscountedItem("Pies", 10.00, 10.0);
        DiscountedItem discountedItem3 = new DiscountedItem("Kot", 10.00, 10.0);
        System.out.println("item.equals(discountedItem1)=" + item.equals(discountedItem1));
        System.out.println("discountedItem1.equals(discountedItem2)=" +
                discountedItem1.equals(discountedItem2));
        System.out.println("discountedItem1.equals(discountedItem3)=" +
                discountedItem1.equals(discountedItem3));
    }

}
