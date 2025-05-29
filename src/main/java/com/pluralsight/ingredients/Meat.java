package com.pluralsight.ingredients;

public class Meat extends Topping {

    public Meat(String toppingType) {
        super(toppingType);
    }

    // THE SIZE OF THE SANDWICH WILL DETERMINE HOW MUCH EACH MEAT ADDED WILL COST
    @Override
    public double getPrice(int size) {

        double baseMeatPrice = 0;

        if (size == 4) {

            baseMeatPrice = 1.00;

        } else if (size == 8) {

            baseMeatPrice = 2.00;

        } else if (size == 12) {

            baseMeatPrice = 3.00;

        }
        return baseMeatPrice;
    }

}

