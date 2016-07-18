package com.bipu.dto;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Hibernate Model Class */
//@Entity (name="USER_DETAILS")
@Entity
@Table (name="User_Details_Table")
public class UserDetails {

	@Id 
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	@Embedded
	@AttributeOverrides({
	@AttributeOverride (name="street",column=@Column (name="HOME_STREET_NAME")),
	@AttributeOverride (name="city",column=@Column (name="HOME_CITY_NAME")),
	@AttributeOverride (name="state",column=@Column (name="HOME_STATE_NAME")),
	@AttributeOverride (name="pin",column=@Column (name="HOME_PIN_NAME")),})
	private Address homeAddress;
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	@Embedded
	private Address officeAddress;
	
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
	
}
