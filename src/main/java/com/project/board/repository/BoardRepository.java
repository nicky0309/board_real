package com.project.board.repository;

import java.util.List;

import com.project.board.web.board.dto.BoardDto;

//@Mapper
public interface BoardRepository {	
	List<BoardDto> selectAll(BoardDto boardDto);

}
