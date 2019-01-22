package com.svam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.svam.exceptions.AgencyNotFoundException;
import com.svam.models.AgencyHearingTime;
import com.svam.models.User;
import com.svam.repository.AHTRepository;

@Service
public class AgencyHearingServiceImpl implements AgencyHearingService {

	@Autowired
	AHTRepository ahtRepository;

	@Override
	public AgencyHearingTime findByAgencyName(User user) {
		if(!StringUtils.isEmpty(user.getReportingAgency())) {
			List<AgencyHearingTime> agencyHearingTimes = ahtRepository.findByAgencyName(user.getReportingAgency());
			if(agencyHearingTimes.isEmpty()) {
				throw new AgencyNotFoundException(user.getReportingAgency(), ": agency was not found by this name");
			}
			return agencyHearingTimes.get(0);
		}
		else {
			throw new AgencyNotFoundException(user.getReportingAgency(), ": agency was not found by this name");
		}


	}

}
