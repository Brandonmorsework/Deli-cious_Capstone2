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
                System.out.println("");

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

        }

        public void goHome() {


        }





}
