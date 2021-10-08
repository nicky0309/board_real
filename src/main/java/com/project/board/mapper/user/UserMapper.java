package com.project.board.mapper.user;

import org.apache.ibatis.annotations.Mapper;

import com.project.board.web.dto.user.UserDto;

@Mapper
public interface UserMapper {
	
	//회원로그인
	UserDto signinUser(UserDto userDto);
	UserDto checkUserID(UserDto userDto);
	
	//회원가입
	int signUpUser(UserDto userDto);
	
	
}
