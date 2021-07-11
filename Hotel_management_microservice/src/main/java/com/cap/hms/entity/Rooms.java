package com.cap.hms.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Rooms")
public class Rooms {
	
	@Id
	private int roomNum;
	private String roomType;
	private String roomFeatures;
	private int roomCapacity;
	private int roomPrice;
	private String roomStatus;
	public Rooms() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rooms(int roomNum, String roomType, String roomFeatures, int roomCapacity, int roomPrice,
			String roomStatus) {
		super();
		this.roomNum = roomNum;
		this.roomType = roomType;
		this.roomFeatures = roomFeatures;
		this.roomCapacity = roomCapacity;
		this.roomPrice = roomPrice;
		this.roomStatus = roomStatus;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getRoomFeatures() {
		return roomFeatures;
	}
	public void setRoomFeatures(String roomFeatures) {
		this.roomFeatures = roomFeatures;
	}
	public int getRoomCapacity() {
		return roomCapacity;
	}
	public void setRoomCapacity(int roomCapacity) {
		this.roomCapacity = roomCapacity;
	}
	public int getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}
	public String getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}
	


}
