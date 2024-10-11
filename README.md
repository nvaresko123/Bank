Bank Management System

Overview
The Bank Management System is a simple console-based Java application that simulates a banking system. It allows users to add, delete, deposit, withdraw, and view account details for different types of bank 
accounts (Savings and Current accounts). This project demonstrates the use of Object-Oriented Programming (OOP) principles such as inheritance, interfaces, and abstraction.

Features
Add a new account (Savings or Current)
Delete an existing account
Deposit money into an account
Withdraw money from an account (with overdraft limit for Current accounts)
Print account details including balance, interest rate, or overdraft limit
Interest calculation for savings accounts

OOP Concepts Applied
Encapsulation:
Each class (e.g., Account, SavingsAccount, CurrentAccount) encapsulates its state (fields) and behavior (methods).
Inheritance:
SavingsAccount and CurrentAccount classes inherit from the Account class, reusing common functionality while extending the behavior to suit each account type.
Abstraction:
The Account class is abstract, allowing concrete implementations like SavingsAccount and CurrentAccount to define specific behaviors.
Interface:
The AccountOperations interface defines common operations for accounts (deposit(), withdraw(), and getAccountInfo()), ensuring that all account types implement these methods.
