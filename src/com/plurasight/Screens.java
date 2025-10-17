package com.plurasight;

import java.io.IOException;
import java.util.Scanner;

public class Screens {
    static Scanner scanner = new Scanner(System.in);

    public static void homeScreen() throws IOException {
        System.out.println("Welcome to Dzianis Accounting Ledger:");
        System.out.println("" +
                "" +
                "█░░╦─╦╔╗╦─╔╗╔╗╔╦╗╔╗░░█\n" +
                "█░░║║║╠─║─║─║║║║║╠─░░█\n" +
                "█░░╚╩╝╚╝╚╝╚╝╚╝╩─╩╚╝░░█\n" +
                "───▄█▌─▄─▄─▐█▄\n" +
                "───██▌▀▀▄▀▀▐██\n" +
                "───██▌─▄▄▄─▐██\n" +
                "───▀██▌▐█▌▐██▀\n" +
                "▄██████─▀─██████▄");
        System.out.println("(D) Add Deposit");
        System.out.println("(P) Make Payment");
        System.out.println("(L) Ledger");
        System.out.println("(X) Exit");

        String input = scanner.nextLine();

        switch (input.toUpperCase()) {
            case "D":
                com.plurasight.Ledger.deposits();
                homeScreen();
                break;
            case "P":
                com.plurasight.Ledger.payments();
                homeScreen();
                break;
            case "L":
                ledger();
                break;
            case "X":
                System.exit(0);
                break;
            default:
                System.out.println("Incorrect Input ──▄────▄▄▄▄▄▄▄────▄───\n" +
                        "─▀▀▄─▄█████████▄─▄▀▀──\n" +
                        "─────██─▀███▀─██──────\n" +
                        "───▄─▀████▀████▀─▄────\n" +
                        "─▀█────██▀█▀██────█▀──\n");
                homeScreen();
        }
    }

    public static void ledger() throws IOException {
        System.out.println("──▄────▄▄▄▄▄▄▄────▄───\n" +
                "─▀▀▄─▄█████████▄─▄▀▀──\n" +
                "─────██─▀███▀─██──────\n" +
                "───▄─▀████▀████▀─▄────\n" +
                "─▀█────██▀█▀██────█▀──\n");
        System.out.println("Welcome to the Ledger:");
        System.out.println("(A) Display all entries");
        System.out.println("(D) Deposits");
        System.out.println("(P) Payments");
        System.out.println("(R) Reports");
        System.out.println("(H) Home");
        String input = scanner.nextLine();

        switch (input.toUpperCase()) {
            case "A":
                com.plurasight.Ledger.allEntries();
                homeScreen();
                break;
            case "D":
                com.plurasight.Ledger.depositOnly();
                homeScreen();
                break;
            case "P":
                com.plurasight.Ledger.paymentsOnly();
                homeScreen();
                break;
            case "R":
                reports();
                break;
            case "H":
                homeScreen();
                break;
            default:
                System.out.println("Incorrect Input ──▄────▄▄▄▄▄▄▄────▄───\n" +
                        "─▀▀▄─▄█████████▄─▄▀▀──\n" +
                        "─────██─▀███▀─██──────\n" +
                        "───▄─▀████▀████▀─▄────\n" +
                        "─▀█────██▀█▀██────█▀──\n");
                homeScreen();
        }
    }

    public static void reports() throws IOException {
        System.out.println(" \\" +
                "▒▒▒▒▒▒▐███████▌\n" +
                "▒▒▒▒▒▒▐░▀░▀░▀░▌\n" +
                "▒▒▒▒▒▒▐▄▄▄▄▄▄▄▌\n" +
                "▄▀▀▀█▒▐░▀▀▄▀▀░▌▒█▀▀▀▄\n" +
                "▌▌▌▌▐▒▄▌░▄▄▄░▐▄▒▌▐▐▐▐ \uFE0E \n");
        System.out.println("Welcome to Reports");
        System.out.println("(1) Months to Date");
        System.out.println("(2) Previous Month");
        System.out.println("(3) Year To Date");
        System.out.println("(4) Previous Year");
        System.out.println("(5) Search by Vendor");
        System.out.println("(H) Home");
        System.out.println("(0) Go Back");
        String input = scanner.nextLine();

        switch (input.toUpperCase()) {
            case "1":
                com.plurasight.Reports.monthToDate();
                //add (0) go back
                break;
            case "2":
                com.plurasight.Reports.previousMonth();
                //add (0) go back
                break;
            case "3":
                com.plurasight.Reports.yearToDate();
                break;
            case "4":
                com.plurasight.Reports.previousYear();
                break;
            case "5":
                com.plurasight.Reports.searchByVendor();
                break;
            case "H":
                homeScreen();
                break;
            case "0":
                System.out.println("♨");
                ledger();
                break;
            default:
                System.out.println("""
                        Incorrect Input ──▄────▄▄▄▄▄▄▄────▄───
                        ─▀▀▄─▄█████████▄─▄▀▀──
                        ─────██─▀███▀─██──────
                        ───▄─▀████▀████▀─▄────
                        ─▀█────██▀█▀██────█▀──
                        """);
                homeScreen();
        }
    }
}