package com.svam.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.svam.models.TicketInfo;

public interface TicketInfoRepository extends CrudRepository<TicketInfo, Integer> {

	public List<TicketInfo> findByDeviceId(String deviceId);
}
