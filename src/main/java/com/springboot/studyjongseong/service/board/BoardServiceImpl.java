package com.springboot.studyjongseong.service.board;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.springboot.studyjongseong.domain.board.BoardRepository;
import com.springboot.studyjongseong.web.dto.board.CreateBoardReqDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	private final BoardRepository boardRepository;
	
	@Override
	public boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception {
		return boardRepository.save(createBoardReqDto.toEntity()) > 0;
	}

	@Override
	public boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception {
		
		return false;
	}

	@Override
	public boolean deleteBoard(int boardcode) throws Exception {
		
		return false;
	}

}
