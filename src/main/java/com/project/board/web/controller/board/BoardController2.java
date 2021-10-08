package com.project.board.web.controller.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.board.web.dto.board.BoardDto;
import com.project.board.web.service.board.BoardService;

@Controller
@RequestMapping("/boardTest")
public class BoardController2 {

	Logger logger = LoggerFactory.getLogger(BoardController2.class);

	
	/*
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/tt")
	public String selectAll(Model model, BoardDto boardDto) {
		
		List<BoardDto> list = boardService.selectAll(boardDto);
		
		System.out.println(list);
		model.addAttribute("list", list);

		return "/Board/boardList";  //jsp 연결
	}
	
*/	
	
	
	
	
	@PostMapping("/axiosTest")
	@ResponseBody
	public Map<String, String> AxiosTest(@RequestParam("id") String id) {
		System.out.println("success");
		System.out.println(id);
		Map <String, String> map = new HashMap<>();
		map.put("id", id);
		System.out.println(map);
		System.out.println("id:? "+map.get("id"));
		return map;
	}
	
	
/*
	@PostMapping("/axiosTest")
	@ResponseBody
	public Map<String, String> AxiosTest(@RequestParam Map<String, Object> param) {
		Map <String, String> map = new HashMap<>();
		System.out.println(param);
		System.out.println("pw  "+param.get("pw"));
		String id = (String)param.get("id");
		map.put("id", id);
		System.out.println("success");
		System.out.println(map);
		return map;
	}
*/	
	
	@RequestMapping("/test")
	public String Test() {
		
		return "/Board/boardTest";  //jsp 연결
	}
	
	@RequestMapping("/test2")
	public String Test2() {
		
		return "test2";  //jsp 연결
	}
	
	
	
}
