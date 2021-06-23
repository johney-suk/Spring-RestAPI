package org.zerock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.RootConfig;
import org.zerock.dto.PageRequestDTO;
import org.zerock.dto.PageResultDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RootConfig.class })
@Log4j
public class BoardServiceTests {

	@Autowired
	private BoardService service;

	@Test
	public void testList() {

		PageRequestDTO dto = PageRequestDTO.builder().build();

		log.info(service);

		service.getList(dto).forEach(board -> log.info(board));

	}

	@Test
	public void testPargeResultDTO() {
		
		PageResultDTO resultDTO = new PageResultDTO(11, 10, 141);
		
		log.info(resultDTO);
	}
}
