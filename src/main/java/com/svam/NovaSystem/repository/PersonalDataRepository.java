package com.svam.NovaSystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.svam.NovaSystem.model.PersonalData;

/**
 * This will be auto implemented by the Spring 
 * CRUD stands for Create read update and delete
 * @author tanujkathuria
 *
 */
public interface PersonalDataRepository extends CrudRepository<PersonalData, Integer>{

}
