package org.zerock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageRequestDTO {

	@Builder.Default
	private int page = 1;
	@Builder.Default
	private int size = 10;
	
	//t,c, w, tc,tw,tcw
	private String type;
	private String keyword;
	
	public int getSkip() {
		return (page -1) * size;
	}
	public String[] getArr() {
		if(keyword == null) {
			return null;
		}
		return type.split("");
	}
	
}
