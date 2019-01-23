package com.svam.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svam.dto.MasterDataDTO;
import com.svam.dto.ViolationDataDTO;
import com.svam.models.City;
import com.svam.models.State;
import com.svam.models.Violation;
import com.svam.models.ViolationDetails;
import com.svam.repository.CityRepository;
import com.svam.repository.StateRepository;
import com.svam.repository.ViolationDetailsRepository;
import com.svam.repository.ViolationRepository;

@Service
public class MasterDetailsServiceImpl implements MasterDetailsService {

	@Autowired
	ViolationDetailsRepository violationDetailsRepository; 
	
	@Autowired
	ViolationRepository violationRepository;
	
	@Autowired
	StateRepository stateRepository;
	
	@Autowired
	CityRepository cityRepository;
	
	
	
	@Override
	public List<MasterDataDTO> getMasterData() {
		
		List<MasterDataDTO> masterDataDTOs =new ArrayList<>();
		List<ViolationDetails> violationDetails =new ArrayList<>();
		List<ViolationDataDTO> violationDataDTOs =new ArrayList<>();
		MasterDataDTO masterDataDTO =new MasterDataDTO();
		List<City> cities =new ArrayList<>();
		List<State> states =new ArrayList<>();
		
		
		violationDetailsRepository.findAll().forEach(e -> violationDetails.add(e));
		
		violationDetails.forEach(v -> {
			ViolationDataDTO violationDataDTO =new ViolationDataDTO();
			State state = new State();
			City city =new City();
			
			Integer recordId = v.getRecordId();
			violationDataDTO.setViolationId(recordId);
			violationDataDTO.setViolationName(v.getName());
			Optional<Violation> violation = violationRepository.findById(recordId);
			if(violation.isPresent()) {
				violationDataDTO.setViolationDescription(violation.get().getDescription());
			}
			city.setCityName(v.getCity());
			state.setStatename(v.getState());
			
			states.add(state);
			cities.add(city);
			
			violationDataDTOs.add(violationDataDTO);
		});
		
		masterDataDTO.setViolationDataDtos(violationDataDTOs);
		masterDataDTO.setCities(cities);
		masterDataDTO.setStates(states);

		masterDataDTOs.add(masterDataDTO);
		
		return masterDataDTOs;
	}

}
