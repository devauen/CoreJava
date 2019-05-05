package com.proartz.Chapter4.Exercise6;

public class Item {

    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object otherObject) {
        if(this == otherObject) return true;
        if(otherObject == null) return false;
        if(!(otherObject instanceof Item)) return false;
        Item other = (Item) otherObject;
        return description.equals(other.description) &&
                price == other.price;
    }

}
