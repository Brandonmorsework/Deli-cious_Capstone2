package com.pluralsight;

import java.util.ArrayList;


public class Sandwich {

    private int size;
    private boolean isExtraCheese;
    private boolean isExtraMeat;
    private boolean isToasted;
    private String breadType;

    private ArrayList<Topping> toppings;

    public Sandwich(int size, String breadType, boolean isToasted, boolean isExtraCheese, boolean isExtraMeat, ArrayList<Topping> toppings) {
        this.size = size;
        this.isExtraCheese = isExtraCheese;
        this.isExtraMeat = isExtraMeat;
        this.isToasted = isToasted;
        this.breadType = breadType;
        this.toppings = toppings;
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

        double finalPrice;
        double addedExtraMeatTopping = 0;
        double addedExtraCheeseTopping = 0;
        double breadLengthCost = 0;

        if (getSize() == 4) {

            breadLengthCost = 5.50;
            addedExtraMeatTopping = 0.50;
            addedExtraCheeseTopping = 0.30;


        }
        else if (getSize() == 8) {

            breadLengthCost = 7.00;
            addedExtraMeatTopping = 1.00;
            addedExtraCheeseTopping = 0.60;


        }

        else if (getSize() == 12) {

            breadLengthCost = 8.50;
            addedExtraMeatTopping = 1.50;
            addedExtraCheeseTopping = 0.90;

        }

        finalPrice = breadLengthCost;

    if (isExtraCheese) {
             finalPrice += addedExtraCheeseTopping;
    }
    if (isExtraMeat) {
            finalPrice += addedExtraMeatTopping;
    }

        return finalPrice;
    }
}
