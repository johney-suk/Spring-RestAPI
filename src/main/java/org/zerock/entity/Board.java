package org.zerock.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Board {

	private Integer bno; //  ºó°ª -> null
	private String title, content, writer;
	private Date regDate, modDate;
	
}
