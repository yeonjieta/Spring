//package com.itbank.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.itbank.model.GocampReviewDTO;
//import com.itbank.model.PagingDTO;
//import com.itbank.service.GocampReviewService;
//
//@Controller
//@RequestMapping("/goCampReview")
//public class GocampReviewController {
//	
//	@Autowired private GocampReviewService gocampReviewService;
//	
//	@GetMapping("")
//	public ModelAndView list(@RequestParam(value = "page", defaultValue = "1") int page) {
//	    int boardCount = gocampReviewService.selectCount();  // 총 게시물의 개수를 불러옴
//	    PagingDTO paging = new PagingDTO(page, boardCount);
//
//	    ModelAndView mav = new ModelAndView("/freeBoard/list");
//	    List<GocampReviewDTO> list = gocampReviewService.selectAll(paging);  // page로 서비스 함수를 호출
//	    mav.addObject("list", list);
//	    mav.addObject("paging", paging);
//	    return mav;
//	}
//
//
//
//	@GetMapping("/write")
//	public void write() {}
//	
//	@PostMapping("/write")
//	public String write(GocampReviewDTO dto) {
//		int row = gocampReviewService.write(dto);
//		System.out.println(row + "행이 추가되었습니다.");
//		return "redirect:/freeBoard";
//	}
//}
//
