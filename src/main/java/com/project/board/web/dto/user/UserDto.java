package com.project.board.web.dto.user;

import org.apache.ibatis.type.Alias;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Alias("UserDto")
public class UserDto {

	private int userNo;
	private int isMember;
	private String id;
	private String passwd;
	private String nickname;
	private String email;
	private String phone;
	
	
}
