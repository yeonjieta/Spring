package com.itbank.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.TestService;

@Controller
public class TestController {

	@Autowired private TestService testService;
	
	@GetMapping("/test")
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView("test");
		String version = testService.selectVersion();
		Date today = testService.selectSysdate();
		
		mav.addObject("version", version);
		mav.addObject("today", today);
		return  mav;
	}
}
