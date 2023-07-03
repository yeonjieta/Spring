package com.itbank.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.itbank.model.YoutubeDTO;

@Repository
public interface YoutubeDAO {
	
	List<YoutubeDTO> selectList();
	
	int insert(YoutubeDTO dto);

	YoutubeDTO selectOne(int idx);

	int delete(int idx);

	int update(YoutubeDTO dto);

}
