package org.zerock.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.dto.PageRequestDTO;
import org.zerock.service.BoardService;
import org.zerock.service.SampleService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@RequestMapping("/board")
@RestController
@Log4j
@RequiredArgsConstructor
public class BoardController {

	private final BoardService service;
	
	private final SampleService sampleService;


	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, Object>> getList(PageRequestDTO dto) {

		log.info("boardService: " + service.getClass().getName());
		log.info("SampleService: " + sampleService.getClass().getName());

		
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("pageRequestDTO", dto);
		map.put("list", service.getList(dto));
		map.put("paging", service.getTotal(dto));

		return ResponseEntity.ok(map);

	}
}
