package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

        private Sandwich sandwich;
        private Scanner scanner;
        private Order order;
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

            order = new Order();

            boolean quit = false;
            while (!quit) {

                System.out.println("==== New Order ====");
                System.out.println(" ");
                System.out.println("1 - Add Sandwich");
                System.out.println("2 - Add Drink");
                System.out.println("3 - Add Chips");
                System.out.println("4 - Checkout");
                System.out.println("0 - Cancel Order");
                System.out.println(" ");
                System.out.println("Enter your Choice:");
                System.out.println(" ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        addSandwich();
                        break;
                    case 2:
                        addDrink();
                        break;
                    case 3:
                        addChips();
                        break;
                    case 4:
                        checkOut();
                        break;
                    case 0:
                        quit = true;

                }
            }
        }

    public void addSandwich() {

        ArrayList<Topping> toppingList = new ArrayList<>();

        System.out.println("Adding Sandwich to Order:");
        System.out.println(" ");
        System.out.println("Please Select a Sandwich Size:");
        System.out.println(" 4 - 4 Inch Sandwich");
        System.out.println(" 8 - 8 Inch Sandwich");
        System.out.println("12 - 12 Inch Sandwich");
        System.out.println(" ");
        int userSandwichSize = scanner.nextInt();

        System.out.println("Please Select a Bread Type: ");
        System.out.println(" ");
        System.out.println("1 - White");
        System.out.println("2 - Wheat");
        System.out.println("3 - Rye");
        System.out.println("4 - Wrap");
        System.out.println(" ");
        int userBreadType = scanner.nextInt();





        System.out.println("Do you Want Your Bread Toasted? ( Y / N )");
        System.out.println(" ");

        String userInput = scanner.nextLine();

        while (!userInput.equalsIgnoreCase("next")) {

            System.out.println("Please Add Your Toppings. Type 'next' When You Are Finished Adding Toppings");
            System.out.println("Meat Toppings:");
            System.out.println("1 - Steak");
            System.out.println("2 - Ham");
            System.out.println("3 - Salami");
            System.out.println("4 - Roast Beef");
            System.out.println("5 - Chicken");
            System.out.println("6 - Bacon");

            int userMeatChoice = scanner.nextInt();

            switch (userMeatChoice) {

                case 1:
                    new Meat("Steak");
                    break;
                case 2:
                    new Meat("Ham");
                    break;
                case 3:
                    new Meat("Salami");
                    break;
                case 4:
                    new Meat("Roast Beef");
                    break;
                case 5:
                    new Meat("Chicken");
                    break;
                case 6:
                    new Meat("Bacon");

            }

            userInput = "next";
        }

            System.out.println("Cheese Toppings:");
            System.out.println("1 - American");
            System.out.println("2 - Provolone");
            System.out.println("3 - Cheddar");
            System.out.println("4 - Swiss");

            int userCheeseChoice = scanner.nextInt();

            switch (userCheeseChoice) {

                case 1:
                    new Cheese("American");
                    break;
                case 2:
                    new Cheese("Provolone");
                    break;
                case 3:
                    new Cheese("Cheddar");
                    break;
                case 4:
                    new Cheese("Swiss");
                    break;

            }

            userInput = "next";


        System.out.println("Do you Want Extra Cheese? ( Y / N )");
        System.out.println(" ");
        System.out.println("Do you Want Extra Meat? ( Y / N )");



        order.addSandwich(sandwich);


    }

    public void addDrink() {


    }

    public void addChips() {


    }

    public void checkOut() {


    }

    public void goHome() {


        }





}
