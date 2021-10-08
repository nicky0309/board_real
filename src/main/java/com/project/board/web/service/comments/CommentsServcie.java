package com.project.board.web.service.comments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.board.mapper.user.UserMapper;
import com.project.board.web.dto.user.UserDto;
import com.project.board.web.service.board.BoardService;

@Service
public class CommentsServcie {

	@Autowired
	private UserMapper userMapper;
	
	Logger logger = LoggerFactory.getLogger(BoardService.class);
	
	public UserDto signinUser(UserDto userDto) {
		return userMapper.signinUser(userDto);
	}
}
