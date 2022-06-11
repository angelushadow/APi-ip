package com.dacartec.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ResponseDto {

	private Long id;
	private LocalDateTime hora;
	private String pais;
	private String iso;
	private String ip;

}
