package com.pluralsight.ingredients;

public class Sauce extends Topping {

    public Sauce(String toppingType) {
        super(toppingType);
    }

    // SAUCES ARE INCLUDED FREE OF CHARGE
    @Override
    public double getPrice(int size) {
        return 0.0;
    }

}
