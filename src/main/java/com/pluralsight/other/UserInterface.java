package com.pluralsight.other;

import com.pluralsight.ingredients.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner;
    private Order order;

    public UserInterface() {

        scanner = new Scanner(System.in);
    }

    //HOME SCREEN DISPLAY WITH A SHORT SWITCH CASE
    public void displayHomeScreen() {

        boolean quit = false;
        while (!quit) {

            System.out.println("=========== Welcome to Deli-cious! ============");
            System.out.println(" ");
            System.out.println("1 - New Order");
            System.out.println("0 - Exit the Deli");
            System.out.println(" ");
            System.out.println("Enter your Choice:");
            System.out.println(" ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    displayOrderScreen();
                    break;
                case "0":
                    quit = true;

            }

        }

    }

    //ORDER SCREEN THAT HANDLES USER OPTIONS THROUGH INT INPUTS
    public void displayOrderScreen() {

        order = new Order();

        boolean quit = false;
        while (!quit) {

            System.out.println("==== New Order ====");
            System.out.println(" ");
            System.out.println("1 - Add Sandwich");
            System.out.println("2 - Add Signature Sandwich");
            System.out.println("3 - Add Drink");
            System.out.println("4 - Add Chips");
            System.out.println("5 - Checkout");
            System.out.println("0 - Cancel Order");
            System.out.println(" ");
            System.out.println("Enter your Choice:");
            System.out.println(" ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        addSandwich();
                        break;
                    case 2:
                        addSignatureSandwich();
                        break;
                    case 3:
                        addDrink();
                        break;
                    case 4:
                        addChips();
                        break;
                    case 5:
                        checkOut();
                        break;
                    case 0:
                        System.out.println(" ");
                        System.out.println("Canceling Order...");
                        System.out.println();
                        clearOrder();
                        quit = true;
                    default:
                        System.out.println("Please Enter a Number Between 0-5!");

                }

            } catch (Exception e) {

                System.out.println("Invalid Entry! Please Enter a Number Between 0-5!");

            }
        }
    }

    // ADDING A SANDWICH TO THE UNCONFIRMED ORDER
    public void addSandwich() {

        ArrayList<Topping> toppingList = new ArrayList<>();

        int userSandwichSize = 0;

        boolean availableBreadSize = false;
        System.out.println("Adding Sandwich to Order:");
        System.out.println(" ");

        while (!availableBreadSize) {


            System.out.println("Please Select a Sandwich Size:");
            System.out.println("1 - 4 Inch Sandwich");
            System.out.println("2 - 8 Inch Sandwich");
            System.out.println("3 - 12 Inch Sandwich");
            System.out.println(" ");

            try {
                userSandwichSize = scanner.nextInt();
                scanner.nextLine();

                switch (userSandwichSize) {
                    case 1:
                        userSandwichSize = 4;
                        availableBreadSize = true;
                        break;
                    case 2:
                        userSandwichSize = 8;
                        availableBreadSize = true;
                        break;
                    case 3:
                        userSandwichSize = 12;
                        availableBreadSize = true;
                        break;
                    default:
                        System.out.println("Invalid Response, Please Enter Either 1, 2, or 3!");

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
                    default:
                        System.out.println("Please Enter a Valid Number Between 1-4!");

                }

            } catch (Exception e) {
                System.out.println("Please Enter a Valid Number for the Cheese Option!");

            }
        }

        // ASK THE USER IF THEY WANT EXTRA CHEESE OR EXTRA MEAT ONLY IF THEY ADDED IT TO THEIR SANDWICH BEFOREHAND

        if (hasCheese) {
            System.out.println("Do you Want Extra Cheese? ( Y / N )");
            String extraCheeseOption = scanner.nextLine();

            isExtraCheese = (extraCheeseOption.equalsIgnoreCase("y") || extraCheeseOption.equalsIgnoreCase("yes"));

            if (isExtraCheese) {

                System.out.println("Added Extra Cheese!");

            } else {
                System.out.println("No Extra Cheese Will be Added");
            }

        } else {

            isExtraCheese = false;

        }

        if (hasMeat) {
        System.out.println(" ");
        System.out.println("Do you Want Extra Meat? ( Y / N )");
        String extraMeatOption = scanner.nextLine();

        isExtraMeat = (extraMeatOption.equalsIgnoreCase("y") || extraMeatOption.equalsIgnoreCase("yes"));

        if (isExtraMeat) {

            System.out.println("Added Extra Meat!");

        } else {

            System.out.println("No Extra Meat Will be Added");

        }

        } else {
            isExtraMeat = false;

        }
//LOOP THE INCLUDED TOPPINGS DISPLAY UNTIL THE USER TYPES 'NEXT'
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
        String userSauceChoice = "";

        while (!userSauceChoice.equalsIgnoreCase("next")) {

            System.out.println("Please Add Your Sauces by Entering the Appropriate Number. Type 'next' When You Are Finished Adding Them");
            System.out.println("Included Toppings:");
            System.out.println("1 - Ketchup");
            System.out.println("2 - Mayo");
            System.out.println("3 - Mustard");
            System.out.println("4 - Ranch");
            System.out.println("5 - Thousand-Islands");
            System.out.println("6 - Vinaigrette");


            try {

                userSauceChoice = scanner.nextLine();

                switch (userSauceChoice) {

                    case "1":
                        toppingList.add(new Sauce("Ketchup"));
                        System.out.println("Added Ketchup!");
                        System.out.println(" ");
                        break;
                    case "2":
                        toppingList.add(new Sauce("Mayo"));
                        System.out.println("Added Mayo!");
                        System.out.println(" ");
                        break;
                    case "3":
                        toppingList.add(new Sauce("Mustard"));
                        System.out.println("Added Mustard!");
                        System.out.println(" ");
                        break;
                    case "4":
                        toppingList.add(new Sauce("Ranch"));
                        System.out.println("Added Ranch");
                        System.out.println(" ");
                        break;
                    case "5":
                        toppingList.add(new Sauce("Thousand-Islands"));
                        System.out.println("Added Thousand-Islands!");
                        System.out.println(" ");
                        break;
                    case "6":
                        toppingList.add(new Sauce("Vinaigrette"));
                        System.out.println("Added Vinaigrette!");
                        System.out.println(" ");
                    case "next":
                        break;
                }


            } catch (Exception e) {
                System.out.println("Please Enter a Valid Number for the Sauces Option!");
            }
        }

        Sandwich sandwich = new Sandwich(userSandwichSize, userBreadType, userBreadToasted, isExtraCheese, isExtraMeat, toppingList);
        order.addSandwich(sandwich);
        System.out.println("Sandwich Successfully Added!");

    }


    public void addSignatureSandwich() {

        String userOption;
        SignatureSandwiches signatureSandwich;

        System.out.println("====== Signature Sandwiches ======= ");
        System.out.println(" ");
        System.out.println("1 - Brandon's BLT Sandwich");
        System.out.println("2 - Carmen's Club Sandwich");
        System.out.println("3 - Vegetarian's Paradise Sandwich");
        System.out.println("0 - Back to Main Menu");

        userOption = scanner.nextLine();

        switch (userOption) {

            case "1":

                signatureSandwich = new BLT();
                customizeSignatureSandwichScreen(signatureSandwich);
                break;

            case "2":
                signatureSandwich = new ClubSandwich();
                customizeSignatureSandwichScreen(signatureSandwich);
                break;

            case "3":
                signatureSandwich = new Vegetarian();
                customizeSignatureSandwichScreen(signatureSandwich);
               break;

            case "0":
                displayOrderScreen();

        }


    }

    public void customizeSignatureSandwichScreen(SignatureSandwiches signatureSandwich) {

        String userOption;

        System.out.println("Would you Like to Customize This Sandwich?  ( Y / N )");

        userOption = scanner.nextLine();

        if (userOption.equalsIgnoreCase("yes") || userOption.equalsIgnoreCase("y")) {

            String customizeOption = "";

            while (!customizeOption.equalsIgnoreCase("next")) {

                System.out.println(" ");
                System.out.println(signatureSandwich);

                System.out.println("Signature Sandwich Customization");
                System.out.println("Please Choose What you Want to Customize. Type 'next' When Finished Customizing:");
                System.out.println(" ");
                System.out.println("1 - Add Toppings");
                System.out.println("2 - Change Toasted Status");
                System.out.println("3 - Change Extra Meat Status");
                System.out.println("4 - Change Extra Cheese Status");
                System.out.println("5 - Change Size");
                System.out.println("6 - Change Bread Type");

                try {


                    customizeOption = scanner.nextLine();

                    switch (customizeOption) {

                        case "1":

                            String userToppingChoice;

                            System.out.println("Which Toppings Would You Like to Add?");
                            System.out.println(" ");
                            System.out.println("1 - Lettuce");
                            System.out.println("2 - Peppers");
                            System.out.println("3 - Onions");
                            System.out.println("4 - Tomatoes");
                            System.out.println("5 - Jalapenos");
                            System.out.println("6 - Cucumbers");
                            System.out.println("7 - Pickles");
                            System.out.println("8 - Guacamole");
                            System.out.println("9 - Mushrooms");

                            userToppingChoice = scanner.nextLine();

                            switch (userToppingChoice) {

                                case "1":
                                    signatureSandwich.addTopping(new RegularToppings("Lettuce"));
                                    System.out.println("Added Lettuce!");
                                    break;
                                case "2":
                                    signatureSandwich.addTopping(new RegularToppings("Peppers"));
                                    System.out.println("Added Peppers!");
                                    break;
                                case "3":
                                    signatureSandwich.addTopping(new RegularToppings("Onions"));
                                    System.out.println("Added Onions!");
                                    break;
                                case "4":
                                    signatureSandwich.addTopping(new RegularToppings("Tomatoes"));
                                    System.out.println("Added Tomatoes!");
                                    break;
                                case "5":
                                    signatureSandwich.addTopping(new RegularToppings("Jalapenos"));
                                    System.out.println("Added Jalapenos!");
                                    break;
                                case "6":
                                    signatureSandwich.addTopping(new RegularToppings("Cucumbers"));
                                    System.out.println("Added Cucumbers!");
                                    break;
                                case "7":
                                    signatureSandwich.addTopping(new RegularToppings("Pickles"));
                                    System.out.println("Added Pickles!");
                                    break;
                                case "8":
                                    signatureSandwich.addTopping(new RegularToppings("Guacamole"));
                                    System.out.println("Added Guacamole!");
                                    break;
                                case "9":
                                    signatureSandwich.addTopping(new RegularToppings("Mushrooms"));
                                    System.out.println("Added Mushrooms!");
                                    break;
                                default:
                                    System.out.println("Invalid Options. Please Enter a Number between 1-9");
                            }

                            break;

                        case "2":
                            System.out.println("Do you Want This Sandwich Toasted?  ( Y / N )");

                            String userToastedOption;
                            userToastedOption = scanner.nextLine();

                            if (userToastedOption.equalsIgnoreCase("yes") || userToastedOption.equalsIgnoreCase("y")) {

                                signatureSandwich.setToasted(true);
                                System.out.println("Your Bread Will be Toasted!");

                            } else {

                                signatureSandwich.setToasted(false);
                                System.out.println("Your Bread Will stay Un-Toasted...");
                            }
                            break;

                        case "3":

                            System.out.println("Do you want to Add Extra Meat to This Sandwich?  ( Y / N )");

                            String userExtraMeatOption;
                            userExtraMeatOption = scanner.nextLine();

                            if (userExtraMeatOption.equalsIgnoreCase("yes") || userExtraMeatOption.equalsIgnoreCase("y")) {
                                signatureSandwich.setExtraMeat(true);
                                System.out.println("Extra Meat Will be Added!");
                            } else {
                                signatureSandwich.setExtraMeat(false);
                                System.out.println("No Extra Meat Will be Added...");
                            }

                            break;

                        case "4":

                            System.out.println("Do you want to Add Extra Cheese to This Sandwich?  ( Y / N )");

                            String userExtraCheeseOption;
                            userExtraCheeseOption = scanner.nextLine();

                            if (userExtraCheeseOption.equalsIgnoreCase("yes") || userExtraCheeseOption.equalsIgnoreCase("y")) {
                                signatureSandwich.setExtraCheese(true);
                                System.out.println("Extra Cheese Added!");
                            } else {
                                signatureSandwich.setExtraCheese(false);
                                System.out.println("No Extra Cheese Will be Added...");
                            }

                            break;

                        case "5":

                            String userSizeOption;

                            System.out.println(signatureSandwich);
                            System.out.println("What Size of this Sandwich do you Want?" );
                            System.out.println("1 - 4 Inch");
                            System.out.println("2 - 8 Inch");
                            System.out.println("3 - 12 Inch");

                            userSizeOption = scanner.nextLine();

//NESTED SWITCH STATEMENT TO HANDLE CHANGING BREAD TYPE AND BREAD SIZE
                            switch (userSizeOption) {

                                case "1":
                                    signatureSandwich.setSize(4);
                                    System.out.println("Changed Bread Size to 4 Inch!");
                                    break;
                                case "2":
                                    signatureSandwich.setSize(8);
                                    System.out.println("Changed Bread Size to 8-Inch!");
                                    break;
                                case  "3":
                                    signatureSandwich.setSize(12);
                                    System.out.println("Changed Bread Size to 12 Inch!");
                                    break;
                                default:
                                    System.out.println("Please Enter Either '1', '2' or '3' for the Bread Size");
                            }

                            break;

                        case "6":

                            System.out.println("What Type of Bread do you Want?");

                            String userBreadTypeOption;

                            System.out.println("1 - White");
                            System.out.println("2 - Wheat");
                            System.out.println("3 - Rye");
                            System.out.println("4 - Wrap");

                            userBreadTypeOption = scanner.nextLine();

                            switch (userBreadTypeOption) {

                                case "1":
                                    signatureSandwich.setBreadType("White");
                                    System.out.println("Changed to White Bread!");
                                    break;
                                case "2":
                                    signatureSandwich.setBreadType("Wheat");
                                    System.out.println("Changed to Wheat Bread!");
                                    break;
                                case "3":
                                    signatureSandwich.setBreadType("Rye");
                                    System.out.println("Changed to Rye Bread");
                                    break;
                                case "4":
                                    signatureSandwich.setBreadType("Wrap");
                                    System.out.println("Sandwich Changed to Wrap!");
                                    break;
                                default:
                                    System.out.println("Please Enter a Number between 1-4 for the Bread Type!");
                            }

                            break;

                    }

                } catch (Exception e) {

                    System.out.println("Invalid Option...");

                }

            }

        }

// ADD THE CUSTOMIZED/NON-CUSTOMIZED SANDWICH TO THE ORDER
        order.addSandwich(signatureSandwich);
        System.out.println("Added Signature Sandwich to Order!");

    }

    // ADDING DRINKS TO THE UNCONFIRMED ORDER

    public void addDrink() {

        String userDrinkSizeChoice;
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


            String userFlavorChoice;
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
                order.addDrinks(drink);
                System.out.println(userDrinkSize + " " +  userFlavor + " " + "Successfully Added!");
                System.out.println(" ");
            } else {
                System.out.println("No Drinks Added...");
                System.out.println("Going Back Home...");
            }
    }

 // ADDING CHIPS TO THE UNCONFIRMED ORDER

    public void addChips() {

    String chipType;

    String chipTypeChoice = "";

        System.out.println("Please Enter the Number of the Chips You Would Like to Add. ");
        System.out.println("When Finished, Type 'next' to go Back to the Home Menu");
        System.out.println("===== Chips ====");
        System.out.println("1 - Cool Ranch Doritos");
        System.out.println("2 - Nacho Cheese Doritos");
        System.out.println("3 - Cheetos");
        System.out.println("4 - Ruffles");
        System.out.println("5 - Lay's Barbecue");
        System.out.println("6 - White Cheddar Popcorn");
        System.out.println("7 - Fritos");

        try {

            chipType = scanner.nextLine();

         switch (chipType) {

             case "1":
                 chipTypeChoice = "Cool Ranch Doritos";
                 System.out.println("Added" + " " + chipTypeChoice + "!");
                 System.out.println(" ");
                 break;
             case "2":
                 chipTypeChoice = "Nacho Cheese Doritos";
                 System.out.println("Added" + " " + chipTypeChoice + "!");
                 System.out.println(" ");
                 break;
             case "3":
                 chipTypeChoice = "Cheetos";
                 System.out.println("Added" + " " + chipTypeChoice + "!");
                 System.out.println(" ");
                 break;
             case "4":
                 chipTypeChoice = "Ruffles";
                 System.out.println("Added" + " " + chipTypeChoice + "!");
                 System.out.println(" ");
                 break;
             case "5":
                 chipTypeChoice = "Lay's Barbecue";
                 System.out.println("Added" + " " + chipTypeChoice + "!");
                 System.out.println(" ");
                 break;
             case "6":
                 chipTypeChoice = "White Cheddar Popcorn";
                 System.out.println("Added" + " " + chipTypeChoice + "!");
                 System.out.println(" ");
                 break;
             case "7":
                 chipTypeChoice = "Fritos";
                 System.out.println("Added" + " " + chipTypeChoice + "!");
                 System.out.println(" ");
                 break;
             case "next":
                 break;
             default:
                 System.out.println("Please Enter a Valid Number Between 1-7!");
                 System.out.println(" ");

         }

        } catch (Exception e) {

            System.out.println("Invalid Number Provided, Please Enter a Number Between 1-7!");


    }
        if (!chipTypeChoice.isEmpty() && !chipTypeChoice.equalsIgnoreCase("next")) {

            Chips chip = new Chips(chipTypeChoice);
            order.addChips(chip);
            System.out.println(chipTypeChoice + " Successfully Added to Order!");

        } else {

            System.out.println("No Chips Added...");
            System.out.println("Going Back Home...");

        }
    }

    // THIS METHOD WILL TAKE THE SANDWICH WITH TOPPINGS, DRINKS AND CHIPS AND DISPLAY THEM TO THE USER TO ASK FOR CONFIRMATION

    public void checkOut() {

        List<Sandwich> sandwiches = order.getSandwiches();
        List<Drink> drinks = order.getDrinks();
        List<Chips> chip = order.getChips();

        System.out.println("==== Check Out ====");
        System.out.println(" ");

        if (!sandwiches.isEmpty() || !drinks.isEmpty() || !chip.isEmpty()) {
            if (!sandwiches.isEmpty()) {
                for (Sandwich sandwich : sandwiches) {


                   if (sandwich.isToasted()) {
                       System.out.println("Toasted " + sandwich.getSize() + " Inch " + sandwich.getBreadType() + " Bread");

                   } else {
                       System.out.println(sandwich.getSize() + " Inch " + sandwich.getBreadType() + " Bread");
                   }


                    for (Topping topping : sandwich.getToppings()) {
                        System.out.println(" -     " + topping.getToppingType());
                    }

                    if (sandwich.isExtraCheese()) {
                        System.out.println("Extra Cheese: " + (sandwich.isExtraCheese() ? "Yes" : "No"));
                    }

                    if (sandwich.isExtraMeat()) {
                        System.out.println("Extra Meat: " + (sandwich.isExtraMeat() ? "Yes" : "No"));
                    }

                    System.out.println(" ");
                }

            } else {
                System.out.println("No Sandwiches Added");
                System.out.println(" ");
            }


            System.out.println(" ");

            if (!chip.isEmpty()) {

                for (Chips chips : chip) {

                    System.out.println(chips.getType());

                }

            } else {

                System.out.println("No Chips Added");

            }

            System.out.println(" ");

            if (!drinks.isEmpty()) {

                for (Drink drink : drinks) {

                    System.out.println(drink.getSize() + " " + drink.getFlavor());

                }

            } else {

                System.out.println("No Drinks Added");
                System.out.println(" ");

            }

            System.out.println(" ");
            System.out.printf("Your Total: $%.2f%n", order.calculateTotal());
            System.out.println(" ");
            System.out.println("Confirm Order to Receive Receipt?  ( Y / N )");

            String userYesOrNo = scanner.nextLine();

            if (userYesOrNo.equalsIgnoreCase("y") || userYesOrNo.equalsIgnoreCase("yes")) {

//ONLY PROCESS THE USER'S ORDER IF EITHER OF THE LISTS CONTAIN ENTRIES, OTHERWISE TAKE THEM BACK TO THE HOME SCREEN
                System.out.println("Thank you for Using the Deli! Come Again!");

                if (!sandwiches.isEmpty() || !drinks.isEmpty() || !chip.isEmpty()) {
                    OrderFileManager orderFileManager = new OrderFileManager();
                    orderFileManager.createReceiptFile(order);
                    System.out.println("Receipt Successfully Added!");
                }

            } else {
                System.out.println(" ");
                System.out.println("Returning Home...");
                System.out.println(" ");

            }

        } else {

            System.out.println("Nothing Added to Order...");
            System.out.println("Returning Home...");
            System.out.println(" ");

        }
    }

    //THIS METHOD WILL CLEAR ALL USER ENTRIES
    public void clearOrder() {

            order.getSandwiches().clear();
            order.getDrinks().clear();
            order.getChips().clear();

        }
}