package com.svam.service;

import com.svam.models.AgencyHearingTime;
import com.svam.models.User;

public interface AgencyHearingService {

	public AgencyHearingTime findByAgencyName(User user) ;
}
