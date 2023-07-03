package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.YoutubeDTO;
import com.itbank.repository.YoutubeDAO;


@Service
public class YoutubeService {
	
	@Autowired private YoutubeDAO dao;
	
	public List<YoutubeDTO> selectList(){
		return dao.selectList();
	}

	public int insert(YoutubeDTO dto) {
		return dao.insert(dto);
	}

	public YoutubeDTO selectOne(int idx) {
		return dao.selectOne(idx);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}

	public int update(YoutubeDTO dto) {
		return dao.update(dto);
	}
	
	
	
	

}
