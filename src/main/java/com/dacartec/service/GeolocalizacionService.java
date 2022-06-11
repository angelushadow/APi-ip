package com.dacartec.service;

import org.springframework.stereotype.Service;

import com.dacartec.dto.GeolocalizacionResponse;

@Service
public interface GeolocalizacionService {

	public GeolocalizacionResponse consultarIp(String ip);

}
