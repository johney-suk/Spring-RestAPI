package org.zerock.service;

import org.springframework.stereotype.Service;
import org.zerock.entity.Board;
import org.zerock.mapper.BoardMapper;

@Service
public class BoardService extends AbstractService<BoardMapper, Board, Integer>{

	public BoardService(BoardMapper mapper) {
		super(mapper);
	}
	
}