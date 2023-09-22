package com.khadri.spring.rest.entity;

public class Address {

	private String line1;

	private String line2;

	private String pinCode;

	private String landMark;

	private AddType addType;

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public AddType getAddType() {
		return addType;
	}

	public void setAddType(AddType addType) {
		this.addType = addType;
	}

}
