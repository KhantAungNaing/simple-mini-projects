package com.bank.services;

import java.util.Scanner;

import com.bank.entity.Account;

public class Bank {
	
	Scanner sc = new Scanner(System.in);
	
	public void depositIntoBalance(int amount , Account user) {
		
		if(amount <= 0) {
			System.out.println("Please Enter Valid Amount!\n");
			return;
		}
		user.setBalance(user.getBalance() + amount);
		user.setPreviousTransaction("Added cash amount of " + user.getBalance() + ".\n");
		System.out.println("Cash amount " + amount + " is deposited successfully.");
		System.out.println("Your Balance is " + user.getBalance() + ".\n");
	}
	
	public void withdrawnCashFromBalance(int withdrawlAmount , Account user) {
		
		if(user.getBalance() > withdrawlAmount && user.getBalance() > 0) {
			user.setBalance(user.getBalance() - withdrawlAmount);
			user.setPreviousTransaction("Withdrawl cash amount of " + user.getBalance() + ".\n");
			System.out.println("Cash withdrawl amount " + withdrawlAmount + " is reduced from your account.");
			System.out.println("Your Balance is " + user.getBalance() + ".\n");
		} else {
			System.out.println("Insufficient amount.\n");
			return;
		}
		
	}
	
	public void getLastTransaction(Account user) {
		System.out.println(user.getPreviousTransaction());
	}
	
	

}
