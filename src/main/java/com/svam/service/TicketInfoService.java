package com.svam.service;

import java.util.List;

import com.svam.models.TicketInfo;

public interface TicketInfoService {

	public List<TicketInfo> getTicketInfo(String deviceId);
	
}
