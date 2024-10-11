package com.nensi;

import java.util.LinkedList;
import java.util.List;

public class Bank {
    private List<Account> accounts;
    private String name;

    public Bank(String name) {
        this.accounts = new LinkedList<>();
        this.name = name;
    }

    public void addAccount(Account account) {
        if (searchAccount(account.getAccountNumber())) {
            System.out.println("Account: " + account.getAccountNumber() + " already exists!");
        } else {
            accounts.add(account);
            System.out.println("Account: " + account.getAccountName() + ", number: " + account.getAccountNumber() + " is successfully added!");
        }
    }

    public void deleteAccount(String accountNumber) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            accounts.remove(account);
            System.out.println("Account number: " + accountNumber + " successfully deleted!");
        } else {
            System.out.println("There's no account: " + accountNumber);
        }
    }

    public void printAccounts() {
        System.out.println("Accounts info: ");
        for (Account account : accounts) {
            account.getAccountInfo();
            System.out.println(); // For better readability
        }
    }

    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public boolean searchAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return true;
            }
        }
        return false;
    }
}
