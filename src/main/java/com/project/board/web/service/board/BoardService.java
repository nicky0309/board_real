package com.project.board.web.service.board;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.board.mapper.board.BoardMapper;
import com.project.board.web.dto.board.BoardDto;

@Service
public class BoardService {
	
	//로거는 도대체.... 어떻게 쓰는걸까?
	Logger logger = LoggerFactory.getLogger(BoardService.class);
	
	@Autowired
	private BoardMapper boardMapper;
	
	public List<BoardDto> getBoardList(BoardDto boardDto) {
		return boardMapper.getBoardList(boardDto);
	}
	
	public BoardDto getBoardDetail(int boardNo) {
		return boardMapper.getBoardDetail(boardNo);
	}
	
	public int insertBoard(BoardDto boardDto) {
		return boardMapper.insertBoard(boardDto);
	}
	
	public int updateBoard(BoardDto boardDto) {
		return boardMapper.updateBoard(boardDto);
	}
	
	public Integer deleteBoard(int[] boardRadio) {
		for(int i : boardRadio)
			boardMapper.deleteBoard(i);
		return null;
	}
	
	public List<BoardDto> searchBoard(BoardDto boardDto) {
		return boardMapper.searchBoard(boardDto);
	}
	
/*
	@Autowired
	autowired가 없으면 boardRepos.이 null값이 나온다. 왜일까?
	private BoardRepository boardRepository;
	
	public List<BoardDto> selectAll(BoardDto boardDto) {
		return boardRepository.selectAll(boardDto);
	}	
*/
	
	
}
