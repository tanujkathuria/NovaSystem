package com.svam.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class State {

	@Id
	@GeneratedValue
	@Column(name = "StateId")
	@JsonIgnore
	private Integer stateid;
	
	@Column(name = "StateName")
	@JsonProperty(value = "name")
	private String statename;
	
	@Column(name = "CountryId")
	@JsonIgnore
	private Integer countryid;

	public Integer getStateid() {
		return stateid;
	}

	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public Integer getCountryid() {
		return countryid;
	}

	public void setCountryid(Integer countryid) {
		this.countryid = countryid;
	}
	
	
}
