package com.dacartec.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Language implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private String code;
	private String name;
	private String natives;

	public Language() {
	}

}
