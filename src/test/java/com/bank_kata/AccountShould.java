package com.bank_kata;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountShould {

    private LocalDateTime LocalDateTime;

    @Test
    void return_balance_when_deposit_is_10() {
        Account account = new Account();
        account.deposit(10);
        assertEquals(10, account.getBalance());
    }

    @Test
    void return_balance_of_20_when_deposit_is_20() {
        Account account = new Account();
        account.deposit(20);
        assertEquals(20, account.getBalance());
    }

    @Test
    void return_balance_of_10_when_withdraw_is_10() {
        Account account = new Account();
        account.deposit(20);
        account.withdraw(10);
        assertEquals(10, account.getBalance());
    }

    @Test
    void return_balance_of_15_when_withdraw_is_5() {
        Account account = new Account();
        account.deposit(20);
        account.withdraw(5);
        assertEquals(15, account.getBalance());
    }

    @Test
    void print_a_statement_of_all_transactions() {
        Account account = new Account();
        account.deposit(30);
        account.deposit(20);
        assertEquals("date || credit || debit || balance\n " +
                "10/08/2019 || || 5.00 || 50\n" +
                "10/08/2019 || 20.00 || || 30.00\n" +
                "10/08/2019 || 10.00 || || 10.00", account.printTransactionHistory());
    }
}
