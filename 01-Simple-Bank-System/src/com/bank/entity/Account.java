package com.bank.entity;

public class Account {

	private int userId;
	private String userName;
	private int balance;
	private String previousTransaction;

	public Account(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getPreviousTransaction() {
		return previousTransaction;
	}

	public void setPreviousTransaction(String previousTransaction) {
		this.previousTransaction = previousTransaction;
	}

}
