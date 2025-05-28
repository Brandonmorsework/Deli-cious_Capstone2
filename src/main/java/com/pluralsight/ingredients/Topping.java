package com.pluralsight.ingredients;

public abstract class Topping {

    private String toppingType;

    public Topping(String toppingType) {
        this.toppingType = toppingType;
    }

    public String getToppingType() {
        return toppingType;
    }

   public abstract double getPrice(int size);

}
