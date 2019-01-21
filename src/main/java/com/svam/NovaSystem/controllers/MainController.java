package com.svam.NovaSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.svam.NovaSystem.model.PersonalData;
import com.svam.NovaSystem.service.PersonalDataService;

/**
 * 
 * @author tanujkathuria
 *
 */
@RestController
@RequestMapping(path="/")
public class MainController {

	@Autowired
	PersonalDataService personalDataService;

	@RequestMapping(path = "/personalData") 
	public PersonalData getPersonalData() {
		return personalDataService.getPersonalData();
	}


	



}
