package com.practice.model;

public class GetByPinandNameRequest {
	
	private String cName;
	private long cpincode;
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public long getCpincode() {
		return cpincode;
	}
	public void setCpincode(long cpincode) {
		this.cpincode = cpincode;
	}
	@Override
	public String toString() {
		return "GetByPinandNameRequest [cName=" + cName + ", cpincode=" + cpincode + "]";
	}
	
	
	

}
