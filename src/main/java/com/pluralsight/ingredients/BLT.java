package com.pluralsight.ingredients;

import java.util.ArrayList;
import java.util.List;

public class BLT extends SignatureSandwiches {
    public BLT() {
        super(12, "White", true, false, false, new ArrayList<>(List.of(new Meat("Bacon"), new Cheese("Cheddar"), new RegularToppings("Lettuce"), new RegularToppings("Tomatoes"), new Sauce("Ranch"))));

    }



}
