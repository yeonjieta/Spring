package com.itbank.repository;

import java.util.List;

import com.itbank.model.UploadDTO;

public interface UploadDAO {

	int insert(UploadDTO dto);

	List<UploadDTO> selectAll();

}
