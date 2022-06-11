package com.dacartec.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dacartec.dto.GeolocalizacionResponse;
import com.dacartec.service.GeolocalizacionService;

@Service
public class GeolocalizacionServiceImpl implements GeolocalizacionService {

	@Value("${access.geolocalizacion}")
	private String ACCESS_KEY;
	
	@Value("${url.geolocalizacion}")
	private String URL;

	private RestTemplate template;

	@Override
	public GeolocalizacionResponse consultarIp(String ip) {

		template = new RestTemplate();
		ResponseEntity<GeolocalizacionResponse> response = 
				template.getForEntity(URL + ip + "?access_key=" + ACCESS_KEY,GeolocalizacionResponse.class);

		return response.getBody();
	}

}
