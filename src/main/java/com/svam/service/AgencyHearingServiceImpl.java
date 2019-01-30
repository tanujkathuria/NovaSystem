package com.svam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.svam.exceptions.AgencyNotFoundException;
import com.svam.models.AgencyHearingTime;
import com.svam.repository.AHTRepository;

@Service
public class AgencyHearingServiceImpl implements AgencyHearingService {

	@Autowired
	AHTRepository ahtRepository;

	@Override
	public AgencyHearingTime findByAgencyName(String agency) {
		
			List<AgencyHearingTime> agencyHearingTimes = ahtRepository.findByAgencyName(agency);
			if(agencyHearingTimes.isEmpty()) {
				throw new AgencyNotFoundException(agency, ": agency was not found by this name");
			}
			return agencyHearingTimes.get(0);
		
	}

	@Override
	public List<AgencyHearingTime> getHearingTime() {
		List<AgencyHearingTime> list =new ArrayList<>();
		 ahtRepository.findAll().forEach(e -> {
			list.add(e);
		});;
		return list;
	}

	@Override
	public ResponseEntity<String> saveHearingTime(AgencyHearingTime agencyHearingTime) {
		AgencyHearingTime aht = ahtRepository.save(agencyHearingTime);
		if(aht != null) {
			return  new ResponseEntity<>("AddHearingTime", HttpStatus.OK);
		}
		return new ResponseEntity<>("AddHearingTime", HttpStatus.BAD_REQUEST);
	}
	
	

	

}
