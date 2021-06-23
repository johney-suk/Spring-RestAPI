package org.zerock.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.dto.PageResultDTO;
import org.zerock.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@RequestMapping("/board")
@RestController
@Log4j
@RequiredArgsConstructor
public class BoardController {

	private final BoardService service;

	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, Object>> getList(PageResultDTO dto) {

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("pageRequestDTO", dto);
		map.put("list", service.getList(dto));
		map.put("paging", service.getTotal(dto));

		return ResponseEntity.ok(map);

	}
}
