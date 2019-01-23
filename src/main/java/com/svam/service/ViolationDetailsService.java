package com.svam.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.svam.dto.SummaryDataDTO;
import com.svam.models.ViolationDetails;

public interface ViolationDetailsService {

	public List<SummaryDataDTO> getViolationDetails(String userId);
	public ResponseEntity<String> saveViolationData(ViolationDetails violationDetails);
}
