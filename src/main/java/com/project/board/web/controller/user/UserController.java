package com.project.board.web.controller.user;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.project.board.web.controller.board.BoardController;
import com.project.board.web.dto.user.UserDto;
import com.project.board.web.service.user.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	Logger logger = LoggerFactory.getLogger(BoardController.class);
	

	@GetMapping("/login")
	public String Login() {
		return "/login/login";
	}
	
	@GetMapping("/signUp")
	public String signUpPage() {
		return "/SignUp/signUpUser";
	}
	
	@PostMapping("/signUp.do")
	public ModelAndView signUp(ModelAndView mv, UserDto userDto) {
		userService.signUpUser(userDto);
		mv.setViewName("redirect:/boardList");
		return mv;
	}
	
	@ResponseBody
	@PostMapping("/login.do")
	public Map<String, Boolean> userLogin(UserDto userDto) {
		Map<String, Boolean> map = new HashMap<>();
		Boolean user = userService.signinUser(userDto);		
		map.put("login", user);
		return map;		
	}
	
	
/*
 * 	
 * 
 * 	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/tt")
	public String selectAll(Model model, BoardDto boardDto) {
		
		List<BoardDto> list = boardService.selectAll(boardDto);
		
		System.out.println(list);
		model.addAttribute("list", list);

		return "/Board/boardList";  //jsp 연결
	}
	
 * 
 * 
 * 
 * 
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
	
 * 
 * */
}
