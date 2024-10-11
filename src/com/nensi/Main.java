package com.nensi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        menu();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();

        Bank bank = new Bank("Erste");

        while (num != 6) {

            switch (num) {

                case 1:
                    System.out.println("1. Add account: ");
                    addAccount(scanner, bank);
                    menu();
                    num = scanner.nextInt();
                    scanner.nextLine();
                    break;

                case 2:
                    System.out.println("2. Delete account: ");
                    deleteAccount(scanner, bank);
                    menu();
                    num = scanner.nextInt();
                    scanner.nextLine();
                    break;

                case 3:
                    System.out.println("3. Deposit: ");
                    deposit(scanner, bank);
                    menu();
                    num = scanner.nextInt();
                    scanner.nextLine();
                    break;

                case 4:
                    System.out.println("4. Withdraw: ");
                    withdraw(scanner, bank);
                    menu();
                    num = scanner.nextInt();
                    scanner.nextLine();
                    break;

                case 5:
                    System.out.println("5. Print accounts:");
                    bank.printAccounts();
                    menu();
                    num = scanner.nextInt();
                    scanner.nextLine();
                    break;

                default:
                    System.out.println("Invalid number, choose from 1 to 6!");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("Choose: ");
        System.out.println("1. Add account: ");
        System.out.println("2. Delete account: ");
        System.out.println("3. Deposit: ");
        System.out.println("4. Withdraw: ");
        System.out.println("5. Print accounts:");
        System.out.println("6. Exit");
    }

    public static void addAccount(Scanner scanner, Bank bank) {

        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter accountNumber: ");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter account type (1 for Savings, 2 for Current): ");
        int accountType = scanner.nextInt();
        scanner.nextLine();

        switch (accountType) {
            case 1:
                System.out.println("Enter interest rate for Savings Account:");
                double interestRate = scanner.nextDouble();
                scanner.nextLine();
                bank.addAccount(new SavingsAccount(name, accountNumber, interestRate));
                break;
            case 2:
                System.out.println("Enter overdraft limit for Current Account:");
                double overdraftLimit = scanner.nextDouble();
                scanner.nextLine();
                bank.addAccount(new CurrentAccount(name, accountNumber, overdraftLimit));
                break;
            default:
                System.out.println("Invalid account type.");
                break;
        }
    }

    public static void deleteAccount(Scanner scanner, Bank bank) {

        System.out.println("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        bank.deleteAccount(accountNumber);
    }

    public static void deposit(Scanner scanner, Bank bank) {
        System.out.println("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = bank.getAccount(accountNumber);
        if (account == null) {
            System.out.println("There's no account " + accountNumber);
        } else {
            System.out.println("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            account.deposit(amount);
        }
    }

    public static void withdraw(Scanner scanner, Bank bank) {

        System.out.println("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = bank.getAccount(accountNumber);
        if (account == null) {
            System.out.println("There's no account " + accountNumber);
        } else {
            System.out.println("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            account.withdraw(amount);
        }
    }
}
