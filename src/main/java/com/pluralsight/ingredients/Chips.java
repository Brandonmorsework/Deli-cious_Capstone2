package com.pluralsight.ingredients;

public class Chips {

    private String type;

    public Chips(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    //CHIPS WILL ALWAYS BE $1.50 REGARDLESS OF SIZE OR TYPE
    public double getPrice() {

        return 1.50;

    }

// RECEIPT OUTPUT FOR CHIPS
    @Override
    public String toString() {
        return type;
    }
}
