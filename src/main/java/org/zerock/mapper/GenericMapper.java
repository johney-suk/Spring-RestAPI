package org.zerock.mapper;


import java.util.List;

import org.zerock.dto.PageRequestDTO;
import org.zerock.dto.PageResultDTO;

public interface GenericMapper<E, K> {

	void insert(E vo);
	
	E select(K key);
	
	void update(E vo);
	
	void delete(K key);
	
	List<E> getPageList(PageRequestDTO dto);
	
	int getCount(PageRequestDTO dto);
	
}
