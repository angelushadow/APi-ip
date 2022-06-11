package com.dacartec.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class RequestDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ip;
	
	public RequestDto() {}

}
