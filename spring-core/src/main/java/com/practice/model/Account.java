package com.practice.model;

import java.util.List;

public class Account {

	private int accountNo;
	private String accountName;
	private double accountBalance;
	private Address address;
	private List<Contact> contacts;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	

	public Account() {
	}

	public Account(int accountNo, String accountName, double accountBalance) {
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountName=" + accountName + ", accountBalance=" + accountBalance
				+ ", address=" + address + ", contacts=" + contacts + "]";
	}

	

}
