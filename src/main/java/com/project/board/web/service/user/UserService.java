package com.project.board.web.service.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.board.mapper.user.UserMapper;
import com.project.board.web.dto.user.UserDto;
import com.project.board.web.service.board.BoardService;

@Service
public class UserService {

	Logger logger = LoggerFactory.getLogger(BoardService.class);

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private BCryptPasswordEncoder encoder;

	
	public Boolean signinUser(UserDto userDto) {
		//userDto 생성자를 하나 만들까?? ID랑 비밀번호만 받는 걸
		String pw = userDto.getPasswd();
		UserDto idcheck = userMapper.checkUserID(userDto);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if(encoder.matches(pw, idcheck.getPasswd())) {
			return true;
		} return false;
		
	}
	
	public UserDto checkUserID(UserDto userDto) {
		userDto = userMapper.checkUserID(userDto);
		return userDto;
	}

	
	//회원가입
	public int signUpUser(UserDto userDto) {
		userDto.setPasswd(encoder.encode(userDto.getPasswd()));
		if (userDto.getEmail() == "")
			userDto.setEmail(null);
		if (userDto.getPhone() == "")
			userDto.setPhone(null);

		return userMapper.signUpUser(userDto);
	}

}
