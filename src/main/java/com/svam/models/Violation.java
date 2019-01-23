package com.svam.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Violation {

	@Id
	@GeneratedValue
	@Column(name = "violation_code")
	private Integer violationCode;
	
	@Column(name = "Description")
	private String description;

	public Integer getViolationCode() {
		return violationCode;
	}

	public void setViolationCode(Integer violationCode) {
		this.violationCode = violationCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
