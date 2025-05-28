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

        LocalDateTime getTimeNow = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String newFileName = "receipts" + "/" + getTimeNow.format(dateTimeFormatter) + ".txt";


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFileName))) {


            for (Sandwich sandwich : order.getSandwiches()) {
                bw.write(sandwich.toString());
                bw.newLine();

            }

            bw.newLine();

            for (Drink drink : order.getDrinks()) {
                bw.write(drink.toString());
                bw.newLine();
            }

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

        System.out.println("Receipt Successfully Added!");

    }

}
