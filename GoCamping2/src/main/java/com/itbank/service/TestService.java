package com.itbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.repository.TestDAO;

@Service
public class TestService {

	@Autowired private TestDAO testDAO;
	
	public String getVersion() {
		return testDAO.getVersion();
	}
	
}
