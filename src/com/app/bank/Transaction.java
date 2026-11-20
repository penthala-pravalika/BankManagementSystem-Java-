
package com.app.bank;

public class Transaction {

    private int transactionId;
    private String type;
    private double amount;

    public Transaction(int transactionId, String type, double amount) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
    }

    // Getter methods
    public int getTransactionId() {
        return transactionId;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}
