package com.proartz.Chapter2.Exercise15;

import java.util.ArrayList;

public class Invoice {

    private String code;

    public static class Item {

        private String description;
        private int quantity;
        private double unitPrice;

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        public double price () { return quantity * unitPrice; }

        public String getDescription() {
            return description;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getUnitPrice() {
            return unitPrice;
        }
    }
    ArrayList<Item> items = new ArrayList<>();

    public Invoice(String code) {
        this.code = code;
    }

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item(description, quantity, unitPrice);
        items.add(newItem);
    }

    public void printInvoice() {
        System.out.printf("Invoice code: %s%n", code);

        System.out.printf("description | quantity | unit price |   price%n");
        for(Item item : items) {
            System.out.printf("%11s   %8d   %10.2f  %8.2f%n",
                    item.getDescription(), item.getQuantity(), item.unitPrice, item.price());
        }
    }
}
