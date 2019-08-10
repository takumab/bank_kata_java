package com.bank_kata;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private int balance;

    public Account() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public String printTransactionHistory() {
        String date = new SimpleDateFormat("dd-mm-yyyy").format(new Date());
        return date;
    }

}
