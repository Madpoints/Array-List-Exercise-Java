package com.Madpoints;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("555 253 5555");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        int choice = 0;
        while (!quit) {
            System.out.println("Enter you choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
        }
    }
}

    private static void startPhone() {
        System.out.println("Starting phone");
    }

    private static void printActions() {
        System.out.println("0 - options");
        System.out.println("1 - print");
        System.out.println("2 - add contact");
        System.out.println("3 - modify contact");
        System.out.println("4 - remove contact");
        System.out.println("5 - search contact");
        System.out.println("6 - quit");
    }
