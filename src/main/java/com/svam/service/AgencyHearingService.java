package com.svam.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.svam.models.AgencyHearingTime;

public interface AgencyHearingService {

	public AgencyHearingTime findByAgencyName(String agency) ;
	public List<AgencyHearingTime> getHearingTime();
	public ResponseEntity<String> saveHearingTime(AgencyHearingTime aht);
}
