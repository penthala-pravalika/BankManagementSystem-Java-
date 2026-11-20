package com.app.bank;

public class BankAccount {

    // Private variables
    private int accno;
    private String name;
    private double amount;

    // Constructor
    public BankAccount(int accno, String name, double amount) {

        this.accno = accno;
        this.name = name;
        this.amount = amount;
    }

    // Getter methods
    public int getAccno() {
        return this.accno;
    }

    public String getName() {
        return this.name;
    }

    public double getAmount() {
        return this.amount;
    }

    // Deposit
    public void deposit(double money) {
        amount += money;
    }

    // Withdraw
    public void withdraw(double money) {
        amount -= money;
    }
}