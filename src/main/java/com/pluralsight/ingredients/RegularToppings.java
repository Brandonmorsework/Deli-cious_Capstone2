package com.pluralsight.ingredients;

public class RegularToppings extends Topping {

    public RegularToppings(String toppingType) {
        super(toppingType);
    }

    //REGARDLESS OF SIZE, TOPPINGS ARE INCLUDED FREE OF CHARGE
    @Override
    public double getPrice(int size) {
        return 0.0;
    }

}
