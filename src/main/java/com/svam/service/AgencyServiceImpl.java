package com.svam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svam.dto.HearingTimeDTO;
import com.svam.exceptions.AgencyNotFoundException;
import com.svam.models.Agency;
import com.svam.repository.AHTRepository;
import com.svam.repository.AgencyRepository;

@Service
public class AgencyServiceImpl implements AgencyService {

	@Autowired
	AgencyRepository agencyRepository;
	
	@Autowired
	AHTRepository ahtRepository;
	
	@Override
	public List<HearingTimeDTO> getAgencyName(Integer agencyId) {
		List<HearingTimeDTO> hearingTimeList =new ArrayList<>();
		Agency agency = agencyRepository.findById(agencyId)
				.orElseThrow(() -> new AgencyNotFoundException(agencyId.toString(),"this agency is not found"));
		 ahtRepository.findByAgencyName(agency.getAgencyName()).forEach(e ->
		 {
			 HearingTimeDTO hearingTimeDTO =new HearingTimeDTO();
			 hearingTimeDTO.setHearingTime(e.getHearingTime());
			 hearingTimeList.add(hearingTimeDTO);
		 });
		
		 return hearingTimeList;
	}

}
