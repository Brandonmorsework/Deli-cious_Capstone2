package com.pluralsight.ingredients;

public class RegularToppings extends Topping {

    public RegularToppings(String toppingType) {
        super(toppingType);
    }

    @Override
    public double getPrice(int size) {
        return 0.0;
    }

}
