package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.BoardDTO;
import com.itbank.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	// db 연결 확인
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		String version = boardService.getVersion();
		mav.addObject("version", version);
		return mav;
	}

	// 리스트 (게시판 전체 글)
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<BoardDTO> list = boardService.selectList();
		mav.addObject("list", list);
		return mav;
	}

	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("view");
		BoardDTO dto = boardService.selectOne(idx);
		mav.addObject("dto", dto);
		return mav;
	}

	@GetMapping("/add")
	public void add() {
	}

	@PostMapping("/add")
	public String add(BoardDTO dto) {
		boardService.insert(dto);
		return "redirect:/list/";
	}

	@GetMapping("/modify/{idx}")
	public ModelAndView modify(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("modify");
		BoardDTO dto = boardService.selectOne(idx);
		mav.addObject("dto", dto);
		return mav;
	}

	@PostMapping("/modify/{idx}")
	public String modify(BoardDTO dto) {
		boardService.update(dto);
		return "redirect:/view/" + dto.getIdx();
	}
	
	@GetMapping("/delete/{idx}")
	public String delete(@PathVariable("idx") int idx) {
		int row = boardService.delete(idx);
		return "redirect:" + (row != 0? "/list" : "/view/" + idx);
	}
	
	@GetMapping("/searchList")
	public ModelAndView searchList(String search) {
		ModelAndView mav = new ModelAndView("list");
		List<BoardDTO> list = boardService.searchList(search);
		mav.addObject("list", list);
		return mav;
	}

}
