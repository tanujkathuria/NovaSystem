package com.svam.dto;

import java.util.Date;

public class SummaryDataDTO {

	private String plate;
	private String type;
	private Date timeofissuance;
	private String state;
	
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getTimeofissuance() {
		return timeofissuance;
	}
	public void setTimeofissuance(Date timeofissuance) {
		this.timeofissuance = timeofissuance;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
