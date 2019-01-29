package com.svam.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.svam.dto.HearingTimeDTO;
import com.svam.models.Agency;

public interface AgencyService {

	public List<HearingTimeDTO> getAgencyName(Integer agencyId);
	public ResponseEntity<String> addAgency(Agency agency);
	public List<Agency> getAgencies();
}
