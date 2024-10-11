package com.nensi;


public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountName, String accountNumber, double interestRate) {
        super(accountName, accountNumber);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest of " + interest + " added. New balance: " + balance);
    }

    @Override
    public void getAccountInfo() {
        super.getAccountInfo();
        System.out.println("Account Type: Savings, Interest Rate: " + interestRate + "%");
    }
}

