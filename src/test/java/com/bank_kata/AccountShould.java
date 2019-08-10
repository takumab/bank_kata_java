package com.bank_kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountShould {

    @Test
    void accept_a_deposit() {
        Account account = new Account();
        assertEquals(10, account.deposit(10));
    }

    @Test
    void accept_a_deposit_of_20() {
        Account account = new Account();
        assertEquals(20, account.deposit(20));
    }

    @Test
    void accept_a_deposit_of_30() {
        Account account = new Account();
        assertEquals(30, account.deposit(30));
    }
    @Test
    void return_balance_when_deposit_is_10() {
        Account account = new Account();
        account.deposit(10);
        assertEquals(10, account.getBalance());
    }

    @Test
    void return_balance_of_20_when_deposit_is_10() {
        Account account = new Account();
        account.deposit(10);
        account.deposit(10);
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


}
