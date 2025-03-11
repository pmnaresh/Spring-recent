package com.practice.model;

public class Laptop {

	private int lapNo;

	private String lapName;

	public Laptop() {
		super();
	}

	public Laptop(int lapNo, String lapName) {
		super();
		this.lapNo = lapNo;
		this.lapName = lapName;
	}

	public int getLapNo() {
		return lapNo;
	}

	public void setLapNo(int lapNo) {
		this.lapNo = lapNo;
	}

	public String getLapName() {
		return lapName;
	}

	public void setLapName(String lapName) {
		this.lapName = lapName;
	}

	@Override
	public String toString() {
		return "Laptop [lapNo=" + lapNo + ", lapName=" + lapName + "]";
	}

}
