package com.bank.test;

import com.bank.entity.Account;
import com.bank.services.Bank;

public class BankTest {
	
	public static void main(String[] args) {
		Account user1 = new Account(1, "John");
		Bank kbzBank = new Bank();
		kbzBank.depositIntoBalance(2, user1);
		kbzBank.getLastTransaction(user1);

		kbzBank.withdrawnCashFromBalance(1, user1);
		kbzBank.getLastTransaction(user1);
	}

}
