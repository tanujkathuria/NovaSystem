package com.svam.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.svam.models.City;

public interface CityRepository extends CrudRepository<City,Integer> {

	
}
