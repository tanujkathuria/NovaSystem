package com.svam.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Country {
	
	@Id
	@GeneratedValue
	@Column(name = "CountryId")
	private int countryId;
	@Column(name = "CountryName")
	private String countryName;
	

}
