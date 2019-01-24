package com.svam.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HearingTimeDTO {

	@JsonProperty("time")
	private Date hearingTime;

	public Date getHearingTime() {
		return hearingTime;
	}

	public void setHearingTime(Date hearingTime) {
		this.hearingTime = hearingTime;
	}
	
	
}
