package com.cap.hms.entity;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Guests")

public class Addguest {
	@Id
	@NotBlank
	private int code;
	@NotBlank
	private String company;
	private String name;
	private String mailid;
	private String gender;
	private String address;
	private long phone_number;
	
	
	public Addguest() {
	}
	public Addguest(int code, String company, String name, String mailid, String gender, String address,
			long phone_number) {
		super();
		this.code = code;
		this.company = company;
		this.name = name;
		this.mailid = mailid;
		this.gender = gender;
		this.address = address;
		this.phone_number = phone_number;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
		
	
	


}
