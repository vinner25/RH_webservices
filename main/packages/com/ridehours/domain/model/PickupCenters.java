package com.ridehours.domain.model;

public class PickupCenters {

	private int pickup_center_id;
	private String pickup_center_name;
	private String address;
	private int pin_code;
	private long contact_number;
	private int city_id;
	public int getPickup_center_id() {
		return pickup_center_id;
	}
	public void setPickup_center_id(int pickup_center_id) {
		this.pickup_center_id = pickup_center_id;
	}
	public String getPickup_center_name() {
		return pickup_center_name;
	}
	public void setPickup_center_name(String pickup_center_name) {
		this.pickup_center_name = pickup_center_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPin_code() {
		return pin_code;
	}
	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}
	public long getContact_number() {
		return contact_number;
	}
	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	
	
}
