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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isExtraCheese() {
        return isExtraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        isExtraCheese = extraCheese;
    }

    public boolean isExtraMeat() {
        return isExtraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        isExtraMeat = extraMeat;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {

        double finalPrice = 0;
        double addedExtraMeatTopping;
        double addedExtraCheeseTopping;
        double addedMeat;
        double addedCheese;
        double breadLengthCost;

        if (size == 4) {

            breadLengthCost = 5.50;
            addedMeat = 1.00;
            addedExtraMeatTopping = 0.50;
            addedCheese = 0.75;
            addedExtraCheeseTopping = 0.30;


        }
        else if (size == 8) {

            breadLengthCost = 7.00;
            addedMeat = 2.00;
            addedExtraMeatTopping = 1.00;
            addedCheese = 1.50;
            addedExtraCheeseTopping = 0.60;

        }

        else if (size == 12) {

            breadLengthCost = 8.50;
            addedMeat = 3.00;
            addedExtraMeatTopping = 1.50;
            addedCheese = 2.25;
            addedExtraCheeseTopping = 0.90;

        }

        if(isExtraCheese) {

            finalPrice = finalPrice + getSize();

    } else {

            finalPrice = finalPrice + 0;

        }

    if (isExtraMeat) {

        finalPrice = finalPrice + getSize();

    } else {

        finalPrice = finalPrice + 0;

    }

        return finalPrice;
    }

}
