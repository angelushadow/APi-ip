package com.dacartec.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dacartec.dto.ResponseDto;

@Service
public interface IpService {

	public ResponseDto consultarIp(String ip);

	public List<ResponseDto> findByCountry(String name);
}
