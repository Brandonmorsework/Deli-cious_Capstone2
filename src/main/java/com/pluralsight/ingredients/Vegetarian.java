package com.pluralsight.ingredients;

import java.util.ArrayList;
import java.util.List;

public class Vegetarian extends SignatureSandwiches{
    public Vegetarian() {
        super(8, "Wheat", false, false, false, new ArrayList<>(List.of(new Cheese("Provolone"), new RegularToppings("Lettuce"), new RegularToppings("Tomatoes"), new RegularToppings("Onions"), new RegularToppings("Guacamole"))));

    }
}
