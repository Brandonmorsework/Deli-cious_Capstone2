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
            }


        }


}
