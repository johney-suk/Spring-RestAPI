package org.zerock.service;

import java.util.List;

import org.zerock.dto.PageRequestDTO;
import org.zerock.dto.PageResultDTO;
import org.zerock.mapper.GenericMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractService<M extends GenericMapper,E, K>{

	private final M mapper;
	
	public List<E> getList(PageRequestDTO dto){
		
		return mapper.getPageList(dto);
	}
	
	public PageResultDTO getTotal(PageRequestDTO dto) {
		
		int totalCount =  mapper.getCount(dto);
		
		return new PageResultDTO(dto.getPage(), dto.getSize(), totalCount);
	}
	
}