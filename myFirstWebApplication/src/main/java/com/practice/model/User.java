package com.practice.model;

public class User {
	
	private int userId;
	private String userName;
	private String userLocation;
	private long userPincode;
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
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
	public long getUserPincode() {
		return userPincode;
	}
	public void setUserPincode(long userPincode) {
		this.userPincode = userPincode;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userLocation=" + userLocation + ", userPincode="
				+ userPincode + "]";
	}
	
	

}
