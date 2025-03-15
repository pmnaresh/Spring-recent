package com.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CUSTOMER_DETAILS")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CUSTOMER_ID")
	private int cId;
	@Column(name="CUSTOMER_NAME")
	private String cName;
	@Column(name="CUSTOMER_LOCATION")
	private String cLocation;
	@Column(name="CUSTOMER_STATE")
	private String cState;
	@Column(name="CUSTOMER_COUNTRY")
	private String cCountry;
	@Column(name="CUSTOMER_CONTACT")
	private long cContact;
	@Column(name="CUSTOMER_PINCODE")
	private long cpincode;

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cLocation=" + cLocation + ", cState=" + cState
				+ ", cCountry=" + cCountry + ", cContact=" + cContact + ", cpincode=" + cpincode + "]";
	}

	public Customer(int cId, String cName, String cLocation, String cState, String cCountry, long cContact,
			long cpincode) {
		this.cId = cId;
		this.cName = cName;
		this.cLocation = cLocation;
		this.cState = cState;
		this.cCountry = cCountry;
		this.cContact = cContact;
		this.cpincode = cpincode;
	}

	public Customer() {
	
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcLocation() {
		return cLocation;
	}

	public void setcLocation(String cLocation) {
		this.cLocation = cLocation;
	}

	public String getcState() {
		return cState;
	}

	public void setcState(String cState) {
		this.cState = cState;
	}

	public String getcCountry() {
		return cCountry;
	}

	public void setcCountry(String cCountry) {
		this.cCountry = cCountry;
	}

	public long getcContact() {
		return cContact;
	}

	public void setcContact(long cContact) {
		this.cContact = cContact;
	}

	public long getCpincode() {
		return cpincode;
	}

	public void setCpincode(long cpincode) {
		this.cpincode = cpincode;
	}

}
