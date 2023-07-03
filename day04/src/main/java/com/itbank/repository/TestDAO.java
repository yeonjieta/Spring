package com.itbank.repository;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.itbank.model.TestDTO;

@Repository
public interface TestDAO {
	
//	@Select("select banner from v$version")
	String selectVersion();
	
	Date selectSysdate();
	
	List<TestDTO> selectYoutubeList();

}
