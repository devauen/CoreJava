package com.proartz.Chapter4.Exercise6;

public class DiscountedItem extends Item {

    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object otherObject) {

        if(super.equals(otherObject)) return true;
        if(otherObject == null) return false;
        if(!(otherObject instanceof DiscountedItem)) return false;
        DiscountedItem other = (DiscountedItem) otherObject;

        return
                getDescription().equals(other.getDescription()) &&
                getPrice() == other.getPrice() &&
                discount == other.discount;
    }

}
