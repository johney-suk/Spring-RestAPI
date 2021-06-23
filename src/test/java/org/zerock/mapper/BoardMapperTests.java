package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.RootConfig;
import org.zerock.dto.PageRequestDTO;
import org.zerock.entity.Board;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper boardMapper;
	

	@Test
	public void testInsert() {
		
		Board board = Board.builder()
				.title("테스트title")
				.content("Test Content")
				.writer("테스트writer")
				.build();
		
		boardMapper.insert(board);
	}
	
	@Test
	public void testSelect() {
		//65521
		Board board =boardMapper.select(65521);
		
		log.info(board);
		
	}
	
	@Test
	public void testGetPageList() {
		
		PageRequestDTO dto = PageRequestDTO.builder()
				.page(3)
				.type("t")
				.keyword("10")
				.build();
		
		log.info(dto);
		
		boardMapper.getPageList(dto).forEach(board ->{
			log.info(board);
		});
	}
	
}
