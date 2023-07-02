package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.itbank.model.BoardDTO;

@Repository
public interface BoardDAO {
	
	@Select("select banner from v$version")
	String selectVersion();

	@Select("select * from board order by idx")
	List<BoardDTO> selectList();

	@Select("select * from board where idx=#{idx} ")
	BoardDTO selectOne(int idx);

	@Insert("insert into board(title,writer,content) values(#{title}, #{writer}, #{content})")
	int insert(BoardDTO dto);

	@Update("update board set title=#{title}, content=#{content} where idx =#{idx}")
	int update(BoardDTO dto);
	
	@Delete("delete board where idx=#{idx}")
	int delete(int idx);

	@Select("select * from board where title like '%${search}%'")
	List<BoardDTO> searchList(String search);
}
