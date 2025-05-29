package com.pluralsight.ingredients;

import java.util.List;

public class Vegeterian extends SignatureSandwiches{
    public Vegeterian() {
        super(8, "Wheat", false, false, false, List.of(new Cheese("Provolone"), new RegularToppings("Lettuce"), new RegularToppings("Tomatoes"), new RegularToppings("Onions"), new RegularToppings("Guacamole")));

    }
}
