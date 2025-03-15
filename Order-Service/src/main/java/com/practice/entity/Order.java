package com.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDER_DETAILS")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ORDER_NUMBER")
	private int oNo;
	@Column(name = "ORDER_NAME")
	private String oName;
	@Column(name = "ORDER_PRICE")
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
