package com.svam.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name ="City")
public class City {

	@Id
	@GeneratedValue
	@Column(name ="city_id")
	@JsonIgnore
	private Integer cityId;
	
	@Column(name ="city_name")
	@JsonProperty(value = "name")
	private String cityName;
	
	@Column(name ="state_id")
	@JsonIgnore
	private Integer stateId;

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	
	
	
}
