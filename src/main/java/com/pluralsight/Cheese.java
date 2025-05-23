package com.pluralsight;

public class Cheese extends Topping {

    public Cheese(String toppingType) {
        super(toppingType);
    }

    @Override
    public double getPrice(int size) {

        double finalCheesePrice = 0;

        if (size == 4) {

            finalCheesePrice = 0.75;

        } else if (size == 8) {

            finalCheesePrice = 1.50;

        } else if (size == 12) {

            finalCheesePrice = 2.25;

        }
        return finalCheesePrice;
    }
}
