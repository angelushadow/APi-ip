package com.dacartec.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dacartec.dto.GeolocalizacionResponse;
import com.dacartec.dto.ResponseDto;
import com.dacartec.service.GeolocalizacionService;
import com.dacartec.service.IpService;
import com.dacartec.service.RegistroService;

@Service
public class IpServiceImp implements IpService {

	@Autowired
	private GeolocalizacionService geolocalizacion;

	@Autowired
	private RegistroService registroService;

	@Override
	public ResponseDto consultarIp(String ip) {

		GeolocalizacionResponse localizacion = geolocalizacion.consultarIp(ip);

		return registroService.save(ResponseDto.builder().hora(LocalDateTime.now()).pais(localizacion.getCountry_name())
				.ip(localizacion.getIp()).iso(localizacion.getCountry_code()).build());
	}

	@Override
	public List<ResponseDto> findByCountry(String name) {

		return registroService.findByCountry(name);
	}

}
