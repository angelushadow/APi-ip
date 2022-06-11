package com.dacartec.service;

import java.util.List;

import com.dacartec.dto.ResponseDto;

public interface RegistroService {

	public ResponseDto save(ResponseDto dto);

	public List<ResponseDto> findByCountry(String name);
}
