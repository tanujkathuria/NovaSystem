package com.svam.dto;

import java.util.List;

import com.svam.models.City;
import com.svam.models.State;

public class MasterDataDTO {

	private List<ViolationDataDTO> violationDataDtos;
	private List<City> cities;
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
