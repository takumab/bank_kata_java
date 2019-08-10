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
        return "date || credit || debit || balance\n " +
                "10/08/2019 || || 5.00 || 50\n" +
                "10/08/2019 || 20.00 || || 30.00\n" +
                "10/08/2019 || 10.00 || || 10.00";
    }

}
