package com.project.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.board.web.dto.board.BoardDto;

@Mapper
public interface BoardRepository {	
	List<BoardDto> selectAll(BoardDto boardDto);

}
