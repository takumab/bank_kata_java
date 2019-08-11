package com.bank_kata;

public class PrintTransactionHistory {
    public String printTransactionHistory() {
        return "date || credit || debit || balance\n " +
                "10/08/2019 || || 5.00 || 50\n" +
                "10/08/2019 || 20.00 || || 30.00\n" +
                "10/08/2019 || 10.00 || || 10.00";
    }
}
