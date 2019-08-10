package com.bank_kata;

public class Account {
    private int balance;

    public Account() {
        this.balance = 0;
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int getBalance() {
        return balance;
    }

}
