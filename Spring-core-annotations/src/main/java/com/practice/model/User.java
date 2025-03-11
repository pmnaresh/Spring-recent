package com.practice.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.practice.pojo.Address;

@Component // by using this annotation spring framework will be maintain this class
public class User {

	private int userId;
	private String userName;
	private double userContact;

	@Autowired // this will do dependency injection
	@Qualifier("address1") // injects particular bean only
	private Address address;

	public User() {
	}

	public User(int userId, String userName, double userContact, Address address) {
		this.userId = userId;
		this.userName = userName;
		this.userContact = userContact;
		this.address = address;
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

	public double getUserContact() {
		return userContact;
	}

	public void setUserContact(double userContact) {
		this.userContact = userContact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userContact=" + userContact + ", address="
				+ address + "]";
	}

}
