package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BankAccountTest {
	
	BankAccount bank = new BankAccount();
	
	@Test
	void testDeposit() {
		bank.deposit(500);
		assertEquals(500,bank.getBalance());
	}
	
	@Test
	void testWithdraw() {
		bank.deposit(500);
		bank.withdraw(300);
		assertEquals(200,bank.getBalance());
	}
	
	@Test
    void testWithdrawInsufficientBalance() {
        assertThrows(IllegalArgumentException.class, () -> {
            bank.withdraw(100);
        });
    }
}
