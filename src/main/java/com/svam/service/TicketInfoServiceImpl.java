package com.svam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svam.exceptions.TicketInfoNotFoundException;
import com.svam.models.TicketInfo;
import com.svam.repository.TicketInfoRepository;

@Service
public class TicketInfoServiceImpl implements TicketInfoService {

	@Autowired
	TicketInfoRepository ticketInfoRepository;
	
	@Override
	public List<TicketInfo> getTicketInfo(String deviceId) {
		if(ticketInfoRepository.findByDeviceId(deviceId) == null) {
			throw new TicketInfoNotFoundException(deviceId, ": ticket details not found for this device id");
		}
		return ticketInfoRepository.findByDeviceId(deviceId);
	}

}
