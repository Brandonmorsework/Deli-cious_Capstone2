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
        String userBreadType = scanner.nextLine();

        switch (userBreadType) {
            case "1":
                userBreadType = "White";
                break;
            case "2":
                userBreadType = "Wheat";
                break;
            case "3":
                userBreadType = "Rye";
                break;
            case "4":
                userBreadType = "Wrap";
                break;
        }





        System.out.println("Do you Want Your Bread Toasted? ( Y / N )");
        System.out.println(" ");
        boolean userBreadToasted = scanner.hasNextBoolean();

        String userInput = scanner.nextLine();

        while (!userInput.equalsIgnoreCase("next")) {

            System.out.println("Please Add Your Meat Topping by Entering the Appropriate Number. Type 'next' When You Are Finished Adding Meat");
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
                    toppingList.add(new Meat("Steak"));
                    break;
                case 2:
                   toppingList.add(new Meat("Ham"));
                    break;
                case 3:
                    toppingList.add(new Meat("Salami"));
                    break;
                case 4:
                    toppingList.add(new Meat("Roast Beef"));
                    break;
                case 5:
                    toppingList.add(new Meat("Chicken"));
                    break;
                case 6:
                    toppingList.add(new Meat("Bacon"));
                    break;

            }

            userInput = "next";
        }

        while (!userInput.equalsIgnoreCase("next")) {

            System.out.println("Please Add Your Cheese Topping by Entering the Appropriate Number. Type 'next' When You Are Finished Adding Cheese");
            System.out.println("Cheese Toppings:");
            System.out.println("1 - American");
            System.out.println("2 - Provolone");
            System.out.println("3 - Cheddar");
            System.out.println("4 - Swiss");

            int userCheeseChoice = scanner.nextInt();

            switch (userCheeseChoice) {

                case 1:
                    toppingList.add(new Cheese("American"));
                    break;
                case 2:
                    toppingList.add(new Cheese("Provolone"));
                    break;
                case 3:
                    toppingList.add(new Cheese("Cheddar"));
                    break;
                case 4:
                    toppingList.add(new Cheese("Swiss"));
                    break;

            }

            userInput = "next";
        }

        System.out.println("Do you Want Extra Cheese? ( Y / N )");
        String extraCheeseOption = scanner.nextLine();

        if (extraCheeseOption.equalsIgnoreCase("y") || extraCheeseOption.equalsIgnoreCase("yes")) {
            boolean isExtraCheese = true;
        } else {
            boolean isExtraCheese = false;
        }


        System.out.println(" ");
        System.out.println("Do you Want Extra Meat? ( Y / N )");

        System.out.println("Please Add Your Included Toppings by Entering the Appropriate Number. Type 'next' When You Are Finished Adding Them");
        System.out.println("Included Toppings:");
        System.out.println("1 - Lettuce");
        System.out.println("2 - Peppers");
        System.out.println("3 - Onions");
        System.out.println("4 - Tomatoes");
        System.out.println("5 - Jalapenos");
        System.out.println("6 - Cucumbers");
        System.out.println("7 - Pickles");
        System.out.println("8 - Guacamole");
        System.out.println("9 - Mushrooms");

        int userToppingChoice = scanner.nextInt();

        while (!userInput.equalsIgnoreCase("next")) {


            switch (userToppingChoice) {

                case 1:
                    toppingList.add(new RegularToppings("Lettuce"));
                    break;
                case 2:
                    toppingList.add(new RegularToppings("Peppers"));
                    break;
                case 3:
                    toppingList.add(new RegularToppings("Onions"));
                    break;
                case 4:
                    toppingList.add(new RegularToppings("Tomatoes"));
                    break;
                case 5:
                    toppingList.add(new RegularToppings("Jalapenos"));
                    break;
                case 6:
                    toppingList.add(new RegularToppings("Cucumbers"));
                    break;
                case 7:
                    toppingList.add(new RegularToppings("Pickles"));
                    break;
                case 8:
                    toppingList.add(new RegularToppings("Guacamole"));
                    break;
                case 9:
                    toppingList.add(new RegularToppings("Mushrooms"));
                    break;

            }

                userInput = "next";

        }

        Sandwich sandwich1 = new Sandwich(userSandwichSize, userBreadType, userBreadToasted, isExtraCheese, isExtraMeat );
        order.addSandwich(sandwich1);


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
