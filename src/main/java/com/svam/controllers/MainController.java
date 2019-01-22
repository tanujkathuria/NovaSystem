package com.svam.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.svam.dto.PersonnelDataDTO;
import com.svam.exceptions.UserNotFoundException;
import com.svam.models.AgencyHearingTime;
import com.svam.models.TicketInfo;
import com.svam.models.User;
import com.svam.service.AgencyHearingService;
import com.svam.service.TicketInfoService;
import com.svam.service.UserService;

/**
 * 
 * @author tanujkathuria
 */
@SuppressWarnings("unchecked")
@RestController
@RequestMapping
public class MainController {

	private final static Logger LOGGER = Logger.getLogger(MainController.class.getName());

	@Autowired
	private UserService userService;

	@Autowired
	private AgencyHearingService agencyHearingService;
	
	@Autowired
	private TicketInfoService ticketInfoService;
	

	@GetMapping("/GetPersonnelData/{id}")
	public Map<String, Object> getPersonalData(@PathVariable Long id)  {
		User user = userService.findUser(id)
				.orElseThrow(() -> new UserNotFoundException(id," user is not found"));
		AgencyHearingTime agencyHearingTime = agencyHearingService.findByAgencyName(user);
		Map<String, Object> map = new  HashMap<String, Object>();
		map.put("PersonnelData",PersonnelDataDTO.build(user, agencyHearingTime));
		return map ;
	}

	
	@GetMapping("/GetTicketRange/{id}")
	public Map<String, Object> getTicketRange(@PathVariable String id)  {
		Map<String, Object> map = new  HashMap<String, Object>();
		map.put("summarydata",ticketInfoService.getTicketInfo(id));
		return map ;
	}
	
	/*	
	 * @GetMapping("/employees")
	List<Employee> all() {
		return repository.findAll();
	}


	@PostMapping("/employees")
	Employee newEmployee(@RequestBody Employee newEmployee) {
		return repository.save(newEmployee);
	}
	 * 
	 * @GetMapping("/employees/{id}")
	Employee one(@PathVariable Long id) {

		return repository.findById(id)
			.orElseThrow(() -> new EmployeeNotFoundException(id));
	}

	@PutMapping("/employees/{id}")
	Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

		return repository.findById(id)
			.map(employee -> {
				employee.setName(newEmployee.getName());
				employee.setRole(newEmployee.getRole());
				return repository.save(employee);
			})
			.orElseGet(() -> {
				newEmployee.setId(id);
				return repository.save(newEmployee);
			});
	}

	@DeleteMapping("/employees/{id}")
	void deleteEmployee(@PathVariable Long id) {
		repository.deleteById(id);
	}*/


}
