package com.pluralsight.ingredients;

import java.util.List;


public class Sandwich {

    private int size;
    private boolean isExtraCheese;
    private boolean isExtraMeat;
    private boolean isToasted;
    private String breadType;

    private List<Topping> toppings;

    public Sandwich(int size, String breadType, boolean isToasted, boolean isExtraCheese, boolean isExtraMeat, List<Topping> toppings) {
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

    public boolean isExtraCheese() {
        return isExtraCheese;
    }

    public boolean isExtraMeat() {
        return isExtraMeat;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public String getBreadType() {
        return breadType;
    }

    public List<Topping> getToppings() {
        return toppings;
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

    for (Topping topping : toppings) {
        finalPrice += topping.getPrice(size);
    }


        return finalPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (isToasted) {
            sb.append("Toasted ");
        }
        sb.append(size).append(" Inch ").append(breadType).append(" Bread\n");

        for (Topping topping : toppings) {
            sb.append(" -     ").append(topping.getToppingType()).append("\n");
        }

        sb.append("Extra Cheese: ").append(isExtraCheese ? "Yes" : "No").append("\n");
        sb.append("Extra Meat: ").append(isExtraMeat ? "Yes" : "No").append("\n");




        return sb.toString();
    }
}
