package org.zerock.dto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import lombok.Data;

@Data
public class PageResultDTO {

	private boolean prev, next;
	private int page, size, totalCount;
	private int start, end;
	private List<Integer> pageNumList;

	public PageResultDTO(int page, int size, int totalCount) {

		this.page = page;
		this.size = size;
		this.totalCount = totalCount;

		int tempEnd = (int) (Math.ceil(page / 10.0) * 10.0);

		start = tempEnd - 9;

		prev = start != 1;

		int temp = (int) (Math.ceil(totalCount / (double) size));

		if (temp <= tempEnd) {
			end = temp;
		} else {
			end = tempEnd;
			next = true;
		}

		pageNumList = IntStream.rangeClosed(start, end).boxed().collect(Collectors.toList());

	}

}
