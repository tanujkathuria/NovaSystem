package com.svam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.svam.models.Equipment;
import com.svam.repository.EquipmentRepository;

@Service
public class EquipmentServiceImpl implements EquipmentService{

	@Autowired
	EquipmentRepository equipmentRepository;


	@Override
	public ResponseEntity<String> addEquipment(Equipment equipment) {
		// TODO Auto-generated method stub
		Equipment equi = equipmentRepository.save(equipment);
		if(equi != null) {
			return  new ResponseEntity<>("addEquipment", HttpStatus.OK);
		}
		return new ResponseEntity<>("addEquipment", HttpStatus.BAD_REQUEST);
	}

	@Override
	public List<Equipment> getEquipmentByDeviceType(String deviceType) {
		// TODO Auto-generated method stub
		List<Equipment> equipments =new ArrayList<Equipment>();
		equipmentRepository.findByDeviceType(deviceType).forEach(e -> {
			equipments.add(e);
		});
		return equipments;
	}

}
