package com.pluralsight.ingredients;

import java.util.List;

public class SignatureSandwiches extends Sandwich {


    public SignatureSandwiches(int size, String breadType, boolean isToasted, boolean isExtraCheese, boolean isExtraMeat, List<Topping> toppings) {
        super(size, breadType, isToasted, isExtraCheese, isExtraMeat, toppings);
    }
}

