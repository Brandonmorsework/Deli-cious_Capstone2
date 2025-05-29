package com.pluralsight.ingredients;

public abstract class Topping {

    private String toppingType;

    public Topping(String toppingType) {
        this.toppingType = toppingType;
    }

    public String getToppingType() {
        return toppingType;
    }
// THIS ABSTRACT METHOD WILL BE OVERRIDDEN BY THE MEAT, CHEESE, SAUCE AND REGULAR TOPPINGS DERIVED CLASSES
   public abstract double getPrice(int size);

}
