package com.straw.test.drools.bean.dto;

public class LeaveFormDTO {
	public enum LeaveType{
		MATERNITY, SICK
	}
	
	public enum GenderType{
		MALE, FEMALE
	}
	
	private LeaveType leaveType;
	private GenderType gender;
	private boolean agree = true;
	private String message;
	private Hello hello;
	
	public Hello getHello() {
		return hello;
	}
	public void setHello(Hello hello) {
		this.hello = hello;
	}
	public LeaveType getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}
	public GenderType getGender() {
		return gender;
	}
	public void setGender(GenderType gender) {
		this.gender = gender;
	}
	public boolean isAgree() {
		return agree;
	}
	public void setAgree(boolean agree) {
		this.agree = agree;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
