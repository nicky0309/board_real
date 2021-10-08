package com.project.board.web.dto.board;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("BoardDto")
public class BoardDto {
	
	//boardNo, userNo는 게시판 불러왔을 때 null값을 받기 위함.
	private Integer boardNo;
	private Integer userNo;
	private String content;
	private Date regDate;
	private String title;
	private String nickname;
	int[] boardRadio;
	
	//검색필터
	private String type;
	private String keyword;
}