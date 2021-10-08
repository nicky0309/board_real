package com.project.board.web.controller.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.project.board.web.dto.board.BoardDto;
import com.project.board.web.service.board.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	Logger logger = LoggerFactory.getLogger(BoardController.class);

	
	@GetMapping("/boardList")
	public String getBoardList(Model model, BoardDto boardDto) {
		
		try {
			List <BoardDto> boardList = boardService.getBoardList(boardDto);
			model.addAttribute("boardList", boardList);			
		} catch(Exception e) {
			logger.error("error:", e.getMessage(), e);
		}
		
		return "/Board/boardList";
	}
	
	@GetMapping("/boardWrite")
	public String boardWrite(Model model) {
		int writeOrUpdate = 0;
		model.addAttribute("WOU", writeOrUpdate);
		return "/Board/boardWrite";
	}
	
	@GetMapping("/boardModify")
	public String boardModify(Model model, @RequestParam Integer boardNo) {
		int writeOrUpdate = 1;
		BoardDto boardDetail = boardService.getBoardDetail(boardNo);
		model.addAttribute("WOU", writeOrUpdate);
		model.addAttribute("boardDetail", boardDetail);
		return "/Board/boardWrite";
	}
	
	@GetMapping("/boardDetail")
	public String boardDetail(@RequestParam int boardNo, Model model, BoardDto boardDto) {
		BoardDto boardDetail = boardService.getBoardDetail(boardNo);
		model.addAttribute("boardDetail", boardDetail);
		return "/Board/boardDetail";
	}
	

	@PostMapping("/insertBoard")
	public ModelAndView insertBoard(ModelAndView mv, BoardDto boardDto) {
		logger.info("인서트 컨트롤");
		int rs = boardService.insertBoard(boardDto);
		System.out.println("인서트: "+rs);
		mv.setViewName("redirect:/boardList");
		
		return mv;
	}
	
	@PostMapping("/updateBoard")
	public ModelAndView updateBoard(ModelAndView mv, BoardDto boardDto) {
		int rs = boardService.updateBoard(boardDto);
		System.out.println("업데이트: "+rs);
		mv.setViewName("redirect:/boardList");
		return mv;
	}
	
	@PostMapping("/deleteBoard")
	public ModelAndView deleteBoard(ModelAndView mv, int[] boardRadio) {
		for(int i:boardRadio) System.out.println(i);
		Integer rs = boardService.deleteBoard(boardRadio);
		logger.info("Delete 완");
		mv.setViewName("redirect:/boardList");
		return mv;
	}

	@ResponseBody
	@PostMapping("/searchBoard")
	public Map<String, List<BoardDto>> searchBoard(Model model, BoardDto boardDto) {
		
		Map<String, List<BoardDto>> map = new HashMap<>();

		try {			
			List<BoardDto> searchList = boardService.searchBoard(boardDto);
			map.put("searchList", searchList);
		} catch (Exception e) {
			logger.error("searchError: ", e.getMessage());
		}
		return map;
	}
		

	
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
	

	
	
	
}
