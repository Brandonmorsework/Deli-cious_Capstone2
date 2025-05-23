package com.pluralsight;

public class Sauce extends Topping {

    public Sauce(String toppingType) {
        super(toppingType);
    }

    @Override
    public double getPrice() {
        return 0.0;
    }

}
