package com.pluralsight;

public class RegularToppings extends Topping{

    public RegularToppings(String toppingType) {
        super(toppingType);
    }

    @Override
    public double getPrice(int size) {
        return 0.0;
    }

}
