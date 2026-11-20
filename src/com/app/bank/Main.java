package com.app.bank;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        // Create accounts
        bank.createAccount("Pravalika", 5000);
        bank.createAccount("Rahul", 10000);

        // Deposit
        bank.deposit(100, 2000);

        // Withdraw
        bank.withdraw(101, 3000);

        // Find account
        BankAccount account = bank.findAccount(100);

        if (account != null) {
            System.out.println("Account Holder: " + account.getName());
            System.out.println("Current Balance: " + account.getAmount());
        }
    }
}