package com.pluralsight;

import java.util.Scanner;

public class UserInterface {

        private Sandwich sandwich;
        private Scanner scanner;

        public UserInterface() {
            scanner = new Scanner(System.in);
        }

        public void displayHomeScreen() {

            boolean quit = false;
            while (!quit) {

                System.out.println("=========== Welcome to Deli-cious! ============");
                System.out.println(" ");
                System.out.println("1 - New Order");
                System.out.println("0 - Exit the Deli");

                System.out.println("Enter your Choice:");
                System.out.println(" ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        displayOrderScreen();
                        break;
                    case 0:
                        quit = true;

                }

            }

        }

        public void displayOrderScreen() {

            boolean quit = false;
            while (!quit) {

                System.out.println("==== New Order ====");
                System.out.println(" ");
                System.out.println("1 - Add Sandwich");
                System.out.println("2 - Add Drink");
                System.out.println("3 - Add Chips");
                System.out.println("4 - Checkout");
                System.out.println("0 - Cancel Order");

                System.out.println("Enter your Choice:");
                System.out.println(" ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        displayOrderScreen();
                        break;
                    case 0:
                        quit = true;

                }

            }
        }

        public void goHome() {


        }





}
