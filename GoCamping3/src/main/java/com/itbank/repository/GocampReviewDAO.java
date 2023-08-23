package com.itbank.repository;

import java.util.List;

import com.itbank.model.GocampReviewDTO;
import com.itbank.model.PagingDTO;

public interface GocampReviewDAO {

	int selectCount();

	List<GocampReviewDTO> selectAll(PagingDTO paging);

	int insert(GocampReviewDTO dto);

	List<GocampReviewDTO> getReview(String contentId);

	String writeReview(GocampReviewDTO review);

}
