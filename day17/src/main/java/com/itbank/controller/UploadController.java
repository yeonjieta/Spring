package com.itbank.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.model.UploadDTO;
import com.itbank.service.UploadSerivce;

@Controller
@RequestMapping("/upload")
public class UploadController {
	
	@Autowired private UploadSerivce uploadSerivce;
	
	// 이름을 받는건 getmapping,  내가 넘기는게 중요해 postmapping( 넘기고 내가 원하는 목적을달성, 그럼 이 페이지가 할 일을 다했으니까 다른 페이지로 돌아가야지)
	// postmapping은 db에서 작업을 하던 다른 작업을 하던 넘겨준 데이터로 할 일이 끝났으니 원래페이지나 다른페이지로 가야하기 때문에 redirect를 쓴다
	// 그렇기 때문에 postmapping은 보통 string을 많이 쓴다.
	@PostMapping
	public String upload(UploadDTO dto) throws Exception {
		int row = uploadSerivce.insert(dto);
		System.out.println(row + "행이 추가되었습니다.");
		return "redirect:/";
	}

}
