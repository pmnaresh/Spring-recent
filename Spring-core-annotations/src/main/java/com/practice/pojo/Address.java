package com.practice.pojo;

import org.springframework.stereotype.Component;

@Component // by using this annotation spring will be maintain this class
public class Address {

	private int houseNumber;
	private String streetName;

	public Address(int houseNumber, String streetName) {
		super();
		this.houseNumber = houseNumber;
		this.streetName = streetName;
	}

	public Address() {
		super();
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", streetName=" + streetName + "]";
	}

}
