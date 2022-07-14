package com.springboot.studyjongseong.service.board;

import com.springboot.studyjongseong.web.dto.board.CreateBoardReqDto;


public interface BoardService {
	public boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
//	public Boolean readBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
	public boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception;
	public boolean deleteBoard(int boardcode) throws Exception;
}
