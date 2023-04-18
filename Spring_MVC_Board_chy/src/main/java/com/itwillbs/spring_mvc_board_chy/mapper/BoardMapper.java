package com.itwillbs.spring_mvc_board_chy.mapper;

import com.itwillbs.spring_mvc_board_chy.vo.BoardVO;

public interface BoardMapper {

	// 글 쓰기
	int insertBoard(BoardVO board);

}
