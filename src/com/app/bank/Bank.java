
package com.app.bank;

import java.util.ArrayList;

public class Bank {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    // Create this later when you add transaction functionality
    // private ArrayList<Transaction> transactions = new ArrayList<>();

    private int accountNumber = 100;

    // Create Account
    public void createAccount(String name, double amount) {

        BankAccount bn = new BankAccount(accountNumber++, name, amount);

        accounts.add(bn);

        System.out.println("Account created successfully");
        System.out.println(bn.getAccno() + " " + bn.getName() + " " + bn.getAmount());
    }

    // Find Account
    public BankAccount findAccount(int accno) {

        for (BankAccount bn : accounts) {
            if (bn.getAccno() == accno) {
                return bn;
            }
        }

        return null;
    }

    // Deposit
    public void deposit(int accno, double amount) {

        BankAccount bn = findAccount(accno);

        if (bn != null) {
            bn.deposit(amount);

            System.out.println("Amount deposited successfully");
            System.out.println("Balance: " + bn.getAmount());

        } else {
            System.out.println("Account not found");
        }
    }

    // Withdraw
    public void withdraw(int accno, double amount) {

        BankAccount bn = findAccount(accno);

        if (bn != null) {

            if (bn.getAmount() >= amount) {

                bn.withdraw(amount);

                System.out.println("Withdrawal successful");
                System.out.println("Balance: " + bn.getAmount());

            } else {
                System.out.println("Insufficient balance");
            }

        } else {
            System.out.println("Account not found");
        }
    }
}
