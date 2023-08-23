package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.GocampReviewDTO;
import com.itbank.model.PagingDTO;
import com.itbank.repository.GocampReviewDAO;

@Service
public class GocampReviewService {

	@Autowired private GocampReviewDAO dao;
	
	public int selectCount() {
		return dao.selectCount();
	}

	public List<GocampReviewDTO> selectAll(PagingDTO paging) {
		return dao.selectAll(paging);
	}

	public int write(GocampReviewDTO dto) {
		return dao.insert(dto);
	}

	public List<GocampReviewDTO> getReview(String contentId) {
		return dao.getReview(contentId);
	}

	public String writeReview(GocampReviewDTO review) {
		return dao.writeReview(review);
	}

}


