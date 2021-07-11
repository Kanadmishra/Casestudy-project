package com.cap.hms.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Employees")


public class staff {
	
	@Id
	private int code;
	private String name;
	private String address;
	private int salary;
	private int age;
	private String post;
	private String mailid;
	public staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public staff(int code, String name, String address, int salary, int age, String post, String mailid) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.age = age;
		this.post = post;
		this.mailid = mailid;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
		


}
