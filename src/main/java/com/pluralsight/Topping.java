package com.pluralsight;

public abstract class Topping {

    private String toppingType;

    public Topping(String toppingType) {
        this.toppingType = toppingType;
    }

    public String getToppingType() {
        return toppingType;
    }

    public void setToppingType(String toppingType) {
        this.toppingType = toppingType;
    }

   public abstract double getPrice();

}
