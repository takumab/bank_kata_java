package com.bank_kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountShould {

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


}
