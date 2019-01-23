package com.svam.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.svam.models.ViolationDetails;

public interface ViolationDetailsRepository extends CrudRepository<ViolationDetails, Integer>{

	public List<ViolationDetails> findByUserId(String userId);
}
