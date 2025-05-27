package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();

    public Order(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(List<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public void setChips(List<Chips> chips) {
        this.chips = chips;
    }

    public double calculateTotal() {
        double totalPrice = 0.0;

        for (Sandwich sandwich : sandwiches) {
            totalPrice += sandwich.getPrice();
        }

        for (Chips chips : chips) {
            totalPrice += chips.getPrice();
        }

        for (Drink drink : drinks) {
            totalPrice += drink.getPrice(drink.getSize());
        }

        return totalPrice;
    }

}
