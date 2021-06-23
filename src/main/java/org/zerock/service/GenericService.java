package org.zerock.service;

import java.util.List;

import org.zerock.dto.PageRequestDTO;
import org.zerock.dto.PageResultDTO;

public interface GenericService<E,K> {

	List<E> getList(PageRequestDTO dto);
	
	PageResultDTO getTotal(PageRequestDTO dto);
}