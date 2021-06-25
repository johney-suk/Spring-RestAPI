package org.zerock.service;

import org.springframework.stereotype.Service;
import org.zerock.dto.PageRequestDTO;
import org.zerock.entity.Board;
import org.zerock.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;

@Service
public class BoardServiceImpl extends AbstractService<BoardMapper, Board, Integer> implements BoardService{

	public BoardServiceImpl(BoardMapper mapper) {
		super(mapper);
	}
	
}