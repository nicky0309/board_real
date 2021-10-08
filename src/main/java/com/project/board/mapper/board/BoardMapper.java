package com.project.board.mapper.board;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.board.web.dto.board.BoardDto;

@Mapper
public interface BoardMapper {

	public List<BoardDto> getBoardList(BoardDto boardDto);
	public BoardDto getBoardDetail(int boardNo);
	public int insertBoard(BoardDto boardDto);
	public int updateBoard(BoardDto boardDto);
	public Integer deleteBoard(int boardRadio);
	public List<BoardDto> searchBoard(BoardDto boardDto);
	
}
