package com.project.board.web.dto.comments;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Alias("CommentsDto")
public class CommentsDto {
	
	private int userNo;
	private Integer boardNo;
	private int comNo;
	private String comments;
	private int layer;
	private int orders;
	private int groupNum;
}
