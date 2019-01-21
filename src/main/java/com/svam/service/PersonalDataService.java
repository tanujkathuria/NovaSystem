package com.svam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svam.models.PersonalData;
import com.svam.repository.PersonalDataRepository;

/**
 * 
 * @author tanujkathuria
 *
 */
@Service
public class PersonalDataService {

@Autowired
PersonalDataRepository personalDataRepository;

public PersonalData getPersonalData() {
	return (PersonalData) personalDataRepository.findAll();
}

	
}
