package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Sandwich> sandwiches = new ArrayList<>();
    private Drink drink;
    private Chips chips;

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Chips getChips() {
        return chips;
    }

    public void setChips(Chips chips) {
        this.chips = chips;
    }

    public double calculateTotal() {
        double totalPrice = 0.0;

        for (Sandwich sandwich : sandwiches) {
            sandwiches.add(sandwich);
        }

        if (chips != null) {
            totalPrice += chips.getPrice();
        }

        if (drink != null) {
            totalPrice += drink.getPrice(drink.getSize());
        }
        return totalPrice;
    }

}
