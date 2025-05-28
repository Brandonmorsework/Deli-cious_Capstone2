package com.pluralsight.other;

import com.pluralsight.ingredients.Chips;
import com.pluralsight.ingredients.Drink;
import com.pluralsight.ingredients.Sandwich;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;

    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void addDrinks(Drink drink) {
        this.drinks.add(drink);
    }

    public List<Chips> getChips() {
        return chips;
    }

    public void addChips(Chips chips) {
        this.chips.add(chips);
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
