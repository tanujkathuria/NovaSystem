package com.svam.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.svam.models.Equipment;

public interface EquipmentService {

	public ResponseEntity<String> addEquipment(Equipment equipment);
	public List<Equipment> getEquipmentByDeviceType(String deviceType);
}
