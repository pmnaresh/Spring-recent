package com.practice.model;

public class Order {

	private int oNo;

	private String oName;

	private float oPrice;

	public int getoNo() {
		return oNo;
	}

	public void setoNo(int oNo) {
		this.oNo = oNo;
	}

	public String getoName() {
		return oName;
	}

	public void setoName(String oName) {
		this.oName = oName;
	}

	public float getoPrice() {
		return oPrice;
	}

	public void setoPrice(float oPrice) {
		this.oPrice = oPrice;
	}

	@Override
	public String toString() {
		return "Order [oNo=" + oNo + ", oName=" + oName + ", oPrice=" + oPrice + "]";
	}

}
