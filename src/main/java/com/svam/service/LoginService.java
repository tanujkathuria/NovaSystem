package com.svam.service;

import com.svam.dto.LoginDTO;

public interface LoginService {

	public LoginDTO getLoginDetails(String userName);
}
