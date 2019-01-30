package com.svam.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.svam.models.Equipment;

public interface EquipmentRepository extends CrudRepository<Equipment,Integer>{

	public List<Equipment> findByDeviceType(String deviceType);
}
