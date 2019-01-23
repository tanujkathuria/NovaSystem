package com.svam.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.svam.models.AgencyHearingTime;

public interface AHTRepository extends CrudRepository<AgencyHearingTime, Integer>{

	List<AgencyHearingTime>  findByAgencyName(String agencyName);
}
