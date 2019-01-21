package com.svam.NovaSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svam.NovaSystem.model.PersonalData;
import com.svam.NovaSystem.repository.PersonalDataRepository;

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
