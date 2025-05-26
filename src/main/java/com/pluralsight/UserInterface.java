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

        int userSandwichSize = 0;

        boolean availableBreadSize = false;
        System.out.println("Adding Sandwich to Order:");
        System.out.println(" ");

        while (!availableBreadSize) {


            System.out.println("Please Select a Sandwich Size:");
            System.out.println(" 4 - 4 Inch Sandwich");
            System.out.println(" 8 - 8 Inch Sandwich");
            System.out.println("12 - 12 Inch Sandwich");
            System.out.println(" ");

            try {
                userSandwichSize = scanner.nextInt();
                scanner.nextLine();

                if (userSandwichSize == 4 || userSandwichSize == 8 || userSandwichSize == 12) {
                    availableBreadSize = true;
                } else {
                    System.out.println(" ");
                    System.out.println("Please Enter Either '4', '8' or '12' for the Bread Size");
                    System.out.println(" ");
                    availableBreadSize = false;
                }

            } catch (Exception e) {
                System.out.println(" ");
                System.out.println("Invalid Response, Please Enter a Valid Number!");
                System.out.println(" ");
                scanner.nextLine();
            }
        }

        int userBreadTypeOption;
        String userBreadType = "";

        boolean availableBread = false;

        while (!availableBread) {

            System.out.println("Please Select a Bread Type: ");
            System.out.println(" ");
            System.out.println("1 - White");
            System.out.println("2 - Wheat");
            System.out.println("3 - Rye");
            System.out.println("4 - Wrap");
            System.out.println(" ");

            try {
                userBreadTypeOption = scanner.nextInt();
                scanner.nextLine();

                switch (userBreadTypeOption) {
                    case 1:
                        userBreadType = "White";
                        availableBread = true;
                        break;
                    case 2:
                        userBreadType = "Wheat";
                        availableBread = true;
                        break;
                    case 3:
                        userBreadType = "Rye";
                        availableBread = true;
                        break;
                    case 4:
                        userBreadType = "Wrap";
                        availableBread = true;
                        break;
                    default:
                        System.out.println("Invalid! Please Enter a Number Between 1-4 for the Bread Type!");

                }
            } catch (Exception e) {
                System.out.println("Invalid Response, Please Enter a Valid Number!");
                scanner.nextLine();
            }
        }

        System.out.println("Do you Want Your Bread Toasted? ( Y / N )");
        System.out.println(" ");
        String userBreadToastedOption = scanner.nextLine();
        boolean userBreadToasted;
        if (userBreadToastedOption.equalsIgnoreCase("y") || userBreadToastedOption.equalsIgnoreCase("yes")) {
            System.out.println("Your Bread Will be Toasted!");
            userBreadToasted = true;
        } else {
            System.out.println("Your Bread Will Stay Un-Toasted!");
            userBreadToasted = false;
        }

        System.out.println("Please Add Your Meat Topping by Entering the Appropriate Number.");

        String userMeatChoice = "";
        boolean hasMeat = false;
        boolean isExtraMeat;

        while (!userMeatChoice.equalsIgnoreCase("next")) {

            System.out.println("Meat Toppings: Type 'next' When you are Finished Adding Meat. ");
            System.out.println("1 - Steak");
            System.out.println("2 - Ham");
            System.out.println("3 - Salami");
            System.out.println("4 - Roast Beef");
            System.out.println("5 - Chicken");
            System.out.println("6 - Bacon");

            try {

                userMeatChoice = scanner.nextLine();

                switch (userMeatChoice) {

                    case "1":

                        toppingList.add(new Meat("Steak"));
                        System.out.println("Added Steak!");
                        hasMeat = true;
                        System.out.println(" ");
                        break;
                    case "2":
                        toppingList.add(new Meat("Ham"));
                        System.out.println("Added Ham!");
                        hasMeat = true;
                        System.out.println(" ");
                        break;
                    case "3":
                        toppingList.add(new Meat("Salami"));
                        System.out.println("Added Salami!");
                        hasMeat = true;
                        System.out.println(" ");
                        break;
                    case "4":
                        toppingList.add(new Meat("Roast Beef"));
                        System.out.println("Added Roast Beef!");
                        hasMeat = true;
                        System.out.println(" ");
                        break;
                    case "5":
                        toppingList.add(new Meat("Chicken"));
                        System.out.println("Added Chicken!");
                        hasMeat = true;
                        System.out.println(" ");
                        break;
                    case "6":
                        toppingList.add(new Meat("Bacon"));
                        System.out.println("Added Bacon!");
                        hasMeat = true;
                        System.out.println(" ");
                        break;
                    case "next":
                        break;
                    default:
                        System.out.println("Invalid! Please Enter a Number Between 1-6 for the Meat Option");
                }

            } catch (Exception e) {

                System.out.println("Please Enter a Number for the Meat Option!");

            }
        }

        String userCheeseChoice = "";
        boolean hasCheese = false;
        boolean isExtraCheese;

        while (!userCheeseChoice.equalsIgnoreCase("next")) {

            System.out.println("Please Add Your Cheese Topping by Entering the Appropriate Number.");
            System.out.println("Cheese Toppings: Type 'next' When You Are Finished Adding Cheese.");
            System.out.println("1 - American");
            System.out.println("2 - Provolone");
            System.out.println("3 - Cheddar");
            System.out.println("4 - Swiss");

            try {

                userCheeseChoice = scanner.nextLine();


                switch (userCheeseChoice) {

                    case "1":
                        toppingList.add(new Cheese("American"));
                        System.out.println("Added American Cheese!");
                        hasCheese = true;
                        System.out.println(" ");
                        break;
                    case "2":
                        toppingList.add(new Cheese("Provolone"));
                        System.out.println("Added Provolone Cheese!");
                        hasCheese = true;
                        System.out.println(" ");
                        break;
                    case "3":
                        toppingList.add(new Cheese("Cheddar"));
                        System.out.println("Added Cheddar Cheese!");
                        hasCheese = true;
                        System.out.println(" ");
                        break;
                    case "4":
                        toppingList.add(new Cheese("Swiss"));
                        System.out.println("Added Swiss Cheese!");
                        hasCheese = true;
                        System.out.println(" ");
                        break;
                    case "next":
                        break;

                }

            } catch (Exception e) {
                System.out.println("Please Enter a Valid Number for the Cheese Option!");

            }
        }
        if (hasCheese) {
            System.out.println("Do you Want Extra Cheese? ( Y / N )");
            String extraCheeseOption = scanner.nextLine();

            isExtraCheese = (extraCheeseOption.equalsIgnoreCase("y") || extraCheeseOption.equalsIgnoreCase("yes"));
            System.out.println("Added Extra Cheese!");

        } else {

            isExtraCheese = false;

        }

        if(hasMeat) {
        System.out.println(" ");
        System.out.println("Do you Want Extra Meat? ( Y / N )");
        String extraMeatOption = scanner.nextLine();

        isExtraMeat = (extraMeatOption.equalsIgnoreCase("y") || extraMeatOption.equalsIgnoreCase("yes"));
            System.out.println("Added Extra Meat!");

        } else {
            isExtraMeat = false;
        }

        String userToppingChoice = "";

        while (!userToppingChoice.equalsIgnoreCase("next")) {

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

            try {

                userToppingChoice = scanner.nextLine();

                switch (userToppingChoice) {

                    case "1":
                        toppingList.add(new RegularToppings("Lettuce"));
                        System.out.println("Added Lettuce!");
                        System.out.println(" ");
                        break;
                    case "2":
                        toppingList.add(new RegularToppings("Peppers"));
                        System.out.println("Added Peppers!");
                        System.out.println(" ");
                        break;
                    case "3":
                        toppingList.add(new RegularToppings("Onions"));
                        System.out.println("Added Onions!");
                        System.out.println(" ");
                        break;
                    case "4":
                        toppingList.add(new RegularToppings("Tomatoes"));
                        System.out.println("Added Tomatoes");
                        System.out.println(" ");
                        break;
                    case "5":
                        toppingList.add(new RegularToppings("Jalapenos"));
                        System.out.println("Added Jalapenos!");
                        System.out.println(" ");
                        break;
                    case "6":
                        toppingList.add(new RegularToppings("Cucumbers"));
                        System.out.println("Added Cucumbers!");
                        System.out.println(" ");
                        break;
                    case "7":
                        toppingList.add(new RegularToppings("Pickles"));
                        System.out.println("Added Pickles!");
                        System.out.println(" ");
                        break;
                    case "8":
                        toppingList.add(new RegularToppings("Guacamole"));
                        System.out.println("Added Guacamole!");
                        System.out.println(" ");
                        break;
                    case "9":
                        toppingList.add(new RegularToppings("Mushrooms"));
                        System.out.println("Added Mushrooms!");
                        System.out.println(" ");
                        break;
                    case "next":
                        break;
                }


            } catch (Exception e) {
                System.out.println("Please Enter a Valid Number for the Included Toppings Option!");
            }
        }

        Sandwich sandwich1 = new Sandwich(userSandwichSize, userBreadType, userBreadToasted, isExtraCheese, isExtraMeat, toppingList);
        order.addSandwich(sandwich1);
        System.out.println(sandwich1);

    }

    public void addDrink() {

        String userDrinkSizeChoice = "";
        String userDrinkSize = "";



            System.out.println("Please Enter the Number of the Size of Drink You Would Like to Add. ");
            System.out.println("===== Drinks Sizes ====");
            System.out.println("1 - Small");
            System.out.println("2 - Medium");
            System.out.println("3 - Large");

            try {

                userDrinkSizeChoice = scanner.nextLine();

                switch (userDrinkSizeChoice) {

                    case "1":
                        userDrinkSize = "Small";
                        break;
                    case "2":
                        userDrinkSize = "Medium";
                        break;
                    case "3":
                        userDrinkSize = "Large";
                        break;
                    case "next":
                        break;
                    default:
                        System.out.println("Invalid! Please Enter Either 1, 2, or 3!");


                }

            } catch (Exception e) {
                System.out.println("Invalid Number! Please Enter Either 1, 2, or 3!");

            }


            String userFlavorChoice = "";
            String userFlavor = "";


            System.out.println("Please Enter the Number of the Flavor of Drink You Would Like to Add. ");
            System.out.println("===== Drinks Flavors ====");
            System.out.println(" ");
            System.out.println("1 - Water");
            System.out.println("2 - Coca-Cola");
            System.out.println("3 - Sprite");
            System.out.println("4 - Tea");
            System.out.println("5 - Dr. Pepper ");

            try {

                userFlavorChoice = scanner.nextLine();

                switch (userFlavorChoice) {

                    case "1":
                        userFlavor = "Water";
                        break;
                    case "2":
                        userFlavor = "Coca-Cola";
                        break;
                    case "3":
                        userFlavor = "Sprite";
                        break;
                    case "4":
                        userFlavor = "Tea";
                        break;
                    case "5":
                        userFlavor = "Dr. Pepper";
                        break;
                    case "next":
                        break;
                    default:
                        System.out.println("Invalid! Please Enter a Number Between 1-5!");
                }

            } catch (Exception e) {

                System.out.println("Invalid Number! Please Enter a Number Between 1-5!");
            }


            if (!userDrinkSize.isEmpty() && !userFlavor.isEmpty()) {
                Drink drink = new Drink(userDrinkSize, userFlavor);
                order.addDrink(drink);
                System.out.println(userDrinkSize + userFlavor + "Successfully Added!");
            } else {
                System.out.println("No Drinks Added...");
                System.out.println("Going Back Home...");
            }

    }

    public void addChips() {


    }

    public void checkOut() {


    }

    public void goHome() {


        }





}
