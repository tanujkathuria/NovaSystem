package com.svam.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.svam.models.City;
import com.svam.models.State;

public class MasterDataDTO {

	@JsonProperty("violationdata")
	private List<ViolationDataDTO> violationDataDtos;
	@JsonProperty("state")
	private List<City> cities;
	@JsonProperty("city")
	private List<State> states;
	
	public List<ViolationDataDTO> getViolationDataDtos() {
		return violationDataDtos;
	}
	public void setViolationDataDtos(List<ViolationDataDTO> violationDataDtos) {
		this.violationDataDtos = violationDataDtos;
	}
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	public List<State> getStates() {
		return states;
	}
	public void setStates(List<State> states) {
		this.states = states;
	}

	
	
	
	
}
