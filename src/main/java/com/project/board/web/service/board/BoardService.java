package com.project.board.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.board.repository.BoardRepository;
import com.project.board.web.board.dto.BoardDto;

@Service
public class BoardService {

	@Autowired
	//autowired가 없으면 boardRepos.이 null값이 나온다. 왜일까?
	private BoardRepository boardRepository;
	//로거는 도대체.... 어떻게 쓰는걸까?
	Logger logger = LoggerFactory.getLogger(BoardService.class);
	
	public List<BoardDto> selectAll(BoardDto boardDto) {
		return boardRepository.selectAll(boardDto);
	}	
}
