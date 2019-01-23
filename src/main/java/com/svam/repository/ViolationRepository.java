package com.svam.repository;

import org.springframework.data.repository.CrudRepository;

import com.svam.models.Violation;

public interface ViolationRepository extends CrudRepository<Violation, Integer> {

}
