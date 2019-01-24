package com.svam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.svam.dto.LoginDTO;
import com.svam.exceptions.UserNotFoundException;
import com.svam.models.Agency;
import com.svam.models.User;
import com.svam.repository.AgencyRepository;
import com.svam.repository.UserRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	UserRepository userRepository;

	@Autowired
	AgencyRepository agencyRepository;

	@Override
	public LoginDTO getLoginDetails(String userName) {
		User user = userRepository.findByName(userName);
		LoginDTO loginDTO = null;
		if(!StringUtils.isEmpty(user)) {
			loginDTO =new LoginDTO();
			loginDTO.setSuccess(1);
			loginDTO.setUserId(user.getUserId());
			loginDTO.setAgencyName(user.getReportingAgency());
			Agency agency = agencyRepository.findByAgencyName(user.getReportingAgency());
			if(agency != null) {
				loginDTO.setAgencyId(agency.getAgencyId());
			}
			return loginDTO;
		}
		throw new UserNotFoundException(userName, " user is not found");
	}

}
