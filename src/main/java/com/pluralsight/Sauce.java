package com.pluralsight;

public class Sauce extends Toppings {

    public Sauce(String toppingType) {
        super(toppingType);
    }

    @Override
    public double getPrice() {
        return 0.0;
    }
}
