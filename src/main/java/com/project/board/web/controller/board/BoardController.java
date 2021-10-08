package com.project.board.web.board;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.board.service.BoardService;
import com.project.board.web.board.dto.BoardDto;

@Controller
@RequestMapping("/boardTest")
public class BoardController {

	Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/tt")
	public String selectAll(Model model, BoardDto boardDto) {
		
		List<BoardDto> list = boardService.selectAll(boardDto);
		System.out.println(list);
		model.addAttribute("list", list);
		return "/Board/boardList";  //jsp 연결
	}
	
	@RequestMapping("/test")
	public String Test() {
		
		return "/Board/boardTest";  //jsp 연결
	}
	
	@RequestMapping("/test2")
	public String Test2() {
		
		return "test2";  //jsp 연결
	}
	
}
