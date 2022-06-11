package com.dacartec.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class GeolocalizacionResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String ip;
	private String type;
	private String continent_code;
	private String continent_name;
	private String country_code;
	private String country_name;
	private String region_code;
	private String region_name;
	private String city;
	private String zip;
	private int latitude;
	private String longitude;

	private Location location;

	public GeolocalizacionResponse() {
	}

}
