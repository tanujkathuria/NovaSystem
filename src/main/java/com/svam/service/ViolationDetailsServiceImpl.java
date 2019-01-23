package com.svam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.svam.dto.SummaryDataDTO;
import com.svam.models.ViolationDetails;
import com.svam.repository.StateRepository;
import com.svam.repository.ViolationDetailsRepository;

@Service
public class ViolationDetailsServiceImpl implements ViolationDetailsService{

	@Autowired
	ViolationDetailsRepository violationDetailsRepository;

	@Autowired
	StateRepository stateRepository;


	@Override
	public List<SummaryDataDTO> getViolationDetails(String userId) {
		List<SummaryDataDTO> summaryDataList =new ArrayList<>();

		violationDetailsRepository.findByUserId(userId)
		.forEach(u ->{
			SummaryDataDTO summaryDataDTO =new SummaryDataDTO();
			summaryDataDTO.setPlate(u.getLicensePlate());
			summaryDataDTO.setType(u.getPlaceType());
			summaryDataDTO.setTimeofissuance(u.getTimeOfIssue());
			summaryDataDTO.setState(u.getState());
			summaryDataList.add(summaryDataDTO);

		} );;
		return summaryDataList;
	}


	@Override
	public ResponseEntity<String> saveViolationData(ViolationDetails violationDetails) {
		ViolationDetails vio = violationDetailsRepository.save(violationDetails);
		if(vio != null) {
			return  new ResponseEntity<>("uploadViolationData", HttpStatus.OK);
		}
		return new ResponseEntity<>("uploadViolationData", HttpStatus.BAD_REQUEST);
	}

}
