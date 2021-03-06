package com.svam.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Agency {

	@Id
	@GeneratedValue
	@Column(name="AgencyId")
	private int agencyId;
	
	@Column(name="AgencyName")
	private String agencyName;
	
	@Column(name="AgencyDesc")
	private String agencyDesc;

	public String getAgencyDesc() {
		return agencyDesc;
	}
	public void setAgencyDesc(String agencyDesc) {
		this.agencyDesc = agencyDesc;
	}
	public int getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(int agencyId) {
		this.agencyId = agencyId;
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

}
