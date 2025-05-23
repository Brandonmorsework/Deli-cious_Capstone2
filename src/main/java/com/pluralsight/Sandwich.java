package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    private int size;
    private boolean isExtraCheese;
    private boolean isExtraMeat;
    private boolean isToasted;
    private String breadType;

    private ArrayList<Topping> toppings;

    public Sandwich(int size, boolean isExtraCheese, boolean isExtraMeat, boolean isToasted, String breadType) {
        this.size = size;
        this.isExtraCheese = isExtraCheese;
        this.isExtraMeat = isExtraMeat;
        this.isToasted = isToasted;
        this.breadType = breadType;
        this.toppings = new ArrayList<>();
    }



}
