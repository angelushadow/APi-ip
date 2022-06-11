package com.dacartec.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Location implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long geoname_id;
	private String capital;
	private List<Language> languages;
	private String country_flag;
	private String country_flag_emoji;
	private String country_flag_emoji_unicode;
	private String calling_code;
	private boolean is_eu;

	public Location() {
	}

}
