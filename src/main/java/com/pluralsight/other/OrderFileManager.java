package com.pluralsight.other;

import com.pluralsight.ingredients.Chips;
import com.pluralsight.ingredients.Drink;
import com.pluralsight.ingredients.Sandwich;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class OrderFileManager {


    public void createReceiptFile(Order order) {

// USE LOCALDATE AND LOCALDATETIMEFORMATTER TO CREATE RECEIPTS WITH NAMES BASED ON THE DATE AND TIME THEY WERE CREATED
        LocalDateTime getTimeNow = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String newFileName = "receipts" + "/" + getTimeNow.format(dateTimeFormatter) + ".txt";


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFileName))) {

            bw.write("Thank you for Choosing Deli-cious Deli!\n");
            bw.write("Here is Your Order Summary:\n");
            bw.write(" ");
            bw.newLine();

            bw.write("=== Sandwiches ===\n");
            bw.newLine();
            bw.write(" ");

//ITERATE WITH EACH SANDWICH ADDED WITH 'SANDWICHCOUNT' AS AN INT IN ORDER PROPERLY DISPLAY 'SANDWICH 1', 'SANDWICH 2', 'SANDWICH 3', ETC.
            int sandwichCount = 1;
            for (Sandwich sandwich : order.getSandwiches()) {
                bw.write("Sandwich " + sandwichCount + "\n");
                bw.write(" ");
                bw.write(sandwich.toString());
                bw.newLine();
                sandwichCount++;

            }

            bw.write("=== Drinks ===\n");
            bw.newLine();

            for (Drink drink : order.getDrinks()) {
                bw.write(drink.toString());
                bw.newLine();
            }

            bw.newLine();
            bw.write("=== Chips ===\n");
            bw.newLine();

            for (Chips chips : order.getChips()) {
                bw.write(chips.toString());
                bw.newLine();
            }

            bw.newLine();
            bw.write(String.format("Total: $%.2f", order.calculateTotal()));

        } catch (Exception e) {

            System.out.println("Cannot Write File...");

        }

//CLEAR THE USER'S ORDER AFTER CREATING THE RECEIPT
        order.getSandwiches().clear();
        order.getDrinks().clear();
        order.getChips().clear();

    }

}
