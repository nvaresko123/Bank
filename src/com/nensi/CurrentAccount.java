package com.nensi;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountName, String accountNumber, double overdraftLimit) {
        super(accountName, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance + overdraftLimit) {
            System.out.println("Cannot withdraw " + amount + ". Exceeds overdraft limit.");
        } else {
            balance -= amount;
            System.out.println(amount + " successfully withdrawn, new balance: " + balance);
        }
    }

    @Override
    public void getAccountInfo() {
        super.getAccountInfo();
        System.out.println("Account Type: Current, Overdraft Limit: " + overdraftLimit);
    }
}

