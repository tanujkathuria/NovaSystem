package com.svam.service;

import java.util.List;

import com.svam.dto.HearingTimeDTO;
import com.svam.models.Agency;

public interface AgencyService {

	public List<HearingTimeDTO> getAgencyName(Integer agencyId);
}
