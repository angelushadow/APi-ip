package com.dacartec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dacartec.dto.ResponseDto;
import com.dacartec.dto.mapper.RegistroMapper;
import com.dacartec.repositories.RegistroRepository;
import com.dacartec.service.RegistroService;

@Service
public class RegistroServiceImpl implements RegistroService {

	@Autowired
	private RegistroRepository repository;

	@Override
	public ResponseDto save(ResponseDto dto) {
		return RegistroMapper.INSTANCE.entityToDto(repository.save(RegistroMapper.INSTANCE.dtoToEntity(dto)));
	}

	@Override
	public List<ResponseDto> findByCountry(String name) {
		return RegistroMapper.INSTANCE.listEntityToDto(repository.findByPais(name));
	}

}
