package com.pluralsight.ingredients;

import java.util.List;

public class BLT extends SignatureSandwiches {
    public BLT(int size, String breadType, boolean isToasted, boolean isExtraCheese, boolean isExtraMeat, List<Topping> toppings) {
        super(12, "White", true, false, false, List.of(new Meat("Bacon"), new Cheese("Cheddar"), new RegularToppings("Lettuce"), new RegularToppings("Tomato"), new Sauce("Ranch")));





    }
}
