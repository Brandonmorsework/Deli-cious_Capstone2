package com.pluralsight.ingredients;

import java.util.ArrayList;
import java.util.List;

public class ClubSandwich extends SignatureSandwiches {
    public ClubSandwich() {
        super(8, "Wheat", true, false, false, new ArrayList<>(List.of(new Meat("Bacon"), new Meat("Ham"), new Meat("Salami"), new Cheese("American"), new Sauce("Mayo"), new RegularToppings("Peppers"), new Sauce("Ketchup"))));

    }
}
