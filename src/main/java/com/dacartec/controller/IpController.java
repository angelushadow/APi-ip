package com.dacartec.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dacartec.dto.RequestDto;
import com.dacartec.dto.ResponseDto;
import com.dacartec.service.IpService;

import io.swagger.annotations.ApiOperation;

@RestController
public class IpController {

	@Autowired
	private IpService service;

	@PostMapping(value = "/registro/ip")
	@ApiOperation(value = "Consulta geolocalizacion de la ip y registra en base de datos")
	public ResponseEntity<ResponseDto> registrar(@RequestBody RequestDto request) {
		return new ResponseEntity<>(service.consultarIp(request.getIp()), HttpStatus.OK);
	}

	@GetMapping(value = "/consulta/{nombre_pais}")
	@ApiOperation(value = "Consulta los registros en base de datos por el nombre del pais")
	public ResponseEntity<List<ResponseDto>> buscar(@PathVariable("nombre_pais") String nombrePais) {

		return new ResponseEntity<>(service.findByCountry(nombrePais), HttpStatus.OK);
	}

}
