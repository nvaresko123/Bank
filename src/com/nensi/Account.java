package com.nensi;


public abstract class Account implements AccountOperations {
    protected String accountName;
    protected String accountNumber;
    protected double balance;

    public Account(String accountName, String accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = 0.00;
    }

    public String getAccountName() {
        return accountName;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " successfully deposited!");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Cannot withdraw " + amount + ". Current balance: " + balance);
        } else {
            balance -= amount;
            System.out.println(amount + " successfully withdrawn, new balance: " + balance);
        }
    }

    @Override
    public void getAccountInfo() {
        System.out.println("Account number: " + accountNumber + " Account name: " + accountName + ", balance = " + balance);
    }
}

