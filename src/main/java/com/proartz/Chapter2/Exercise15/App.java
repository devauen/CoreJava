package com.proartz.Chapter2.Exercise15;

public class App {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("12/04/2019 FA");

        invoice.addItem("pen", 4, 1.0);
        invoice.addItem("gum", 4, 0.5);
        invoice.addItem("paper", 100, 0.1);
        invoice.addItem("folder", 50, 2.0);
        invoice.addItem("staples", 1000, 0.01);

        invoice.printInvoice();
    }
}
