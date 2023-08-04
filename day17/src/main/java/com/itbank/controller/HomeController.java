package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.UploadDTO;
import com.itbank.service.UploadSerivce;

@Controller
public class HomeController {
	
	@	Autowired private UploadSerivce uploadService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		List<UploadDTO> list = uploadService.selectAll();
		mav.addObject("list", list);
		return mav;
	}

}
