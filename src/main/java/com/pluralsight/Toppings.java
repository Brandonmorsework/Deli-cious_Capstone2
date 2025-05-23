package com.pluralsight;

public abstract class Toppings {

    private String toppingType;

    public Toppings(String toppingType) {
        this.toppingType = toppingType;
    }

    public String getToppingType() {
        return toppingType;
    }

    public void setToppingType(String toppingType) {
        this.toppingType = toppingType;
    }

   public abstract double getPrice();

}
