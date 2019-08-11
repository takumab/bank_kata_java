package com.bank_kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintTransactionHistoryShould {
    @Test
    void print_a_statement_of_all_transactions() {
        PrintTransactionHistory printer = new PrintTransactionHistory();
        assertEquals("date || credit || debit || balance\n " +
                "10/08/2019 || || 5.00 || 50\n" +
                "10/08/2019 || 20.00 || || 30.00\n" +
                "10/08/2019 || 10.00 || || 10.00", printer.printTransactionHistory());
    }
}
