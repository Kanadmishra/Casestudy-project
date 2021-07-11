package com.cap.hms.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;



@Document(collection = "Bookings")


public class Reservation {

	
	@Id
	private int id;

	private int number_of_adults;
	private int number_of_children;
	private long phone;
	@JsonFormat(pattern = "dd-mm-yyyy",shape =Shape.STRING)
	private String check_in;
	private String check_out;
	private String room_assign;
	
	public Reservation() {
	}

	public Reservation(int id, int number_of_adults, int number_of_children, long phone, String check_in,
			String check_out, String room_assign) {
		super();
		this.id = id;
		this.number_of_adults = number_of_adults;
		this.number_of_children = number_of_children;
		this.phone = phone;
		this.check_in = check_in;
		this.check_out = check_out;
		this.room_assign = room_assign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber_of_adults() {
		return number_of_adults;
	}

	public void setNumber_of_adults(int number_of_adults) {
		this.number_of_adults = number_of_adults;
	}

	public int getNumber_of_children() {
		return number_of_children;
	}

	public void setNumber_of_children(int number_of_children) {
		this.number_of_children = number_of_children;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCheck_in() {
		return check_in;
	}

	public void setCheck_in(String check_in) {
		this.check_in = check_in;
	}

	public String getCheck_out() {
		return check_out;
	}

	public void setCheck_out(String check_out) {
		this.check_out = check_out;
	}

	public String getRoom_assign() {
		return room_assign;
	}

	public void setRoom_assign(String room_assign) {
		this.room_assign = room_assign;
	}
	
	
	
}
