package com.afsdi;

public class BankAccount {
    private long balance;

    // Returns the current balance on the bank account
    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    //constructor
    public BankAccount(long balance) {
        this.balance = balance;
    }

    // Adds cents to the bank account
    public void deposit(long cents) {
        this.balance += cents;
    }

    // Removes cents from the bank account
    public void withdraw(long cents) {
        this.balance -= cents;
    }

    // Returns true if the balance on the account is negative
    public boolean isOverDrawn() {
        if (this.balance < 0) {
            return true;
        } else {
            return false;
        }
    }
}