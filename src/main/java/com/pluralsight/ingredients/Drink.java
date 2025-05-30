package com.pluralsight.ingredients;

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

    public String getFlavor() {
        return flavor;
    }

//HANDLING DRINK PRICING BASED ON SIZE
    public double getPrice(String size) {

        double finalDrinkPrice = 0.0;

        if (size.equalsIgnoreCase("Small")) {

            finalDrinkPrice = 2.00;

        } else if (size.equalsIgnoreCase("Medium")) {

            finalDrinkPrice = 2.50;

        } else if (size.equalsIgnoreCase("Large")) {

            finalDrinkPrice = 3.00;

        }

        return finalDrinkPrice;
    }

//RECEIPT OUTPUT FOR DRINKS
    @Override
    public String toString() {
        return size + " " + flavor;
    }
}
