package com.UserManagementSystem.model;

public class UMS {

private String userId;
private String userName;
private String name;
private String adress;
private String phoneNumber;
/**
 * @param userId
 * @param userName
 * @param name
 * @param adress
 * @param phoneNumber
 */
public UMS(String userId, String userName, String name, String adress, String phoneNumber) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.name = name;
	this.adress = adress;
	this.phoneNumber = phoneNumber;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}







}
