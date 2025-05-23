package com.pluralsight;

public class Drink {

    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice(String size) {

        double finalDrinkPrice = 0.0;

        if (size.equalsIgnoreCase("small")) {

            finalDrinkPrice = 2.00;

        } else if (size.equalsIgnoreCase("medium")) {

            finalDrinkPrice = 2.50;

        } else if (size.equalsIgnoreCase("large")) {

            finalDrinkPrice = 3.00;

        }

        return finalDrinkPrice;
    }

}
