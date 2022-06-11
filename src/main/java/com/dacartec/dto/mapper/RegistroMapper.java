package com.dacartec.dto.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.dacartec.dto.ResponseDto;
import com.dacartec.entity.RegistroEntity;

@Mapper
public interface RegistroMapper {

	RegistroMapper INSTANCE = Mappers.getMapper(RegistroMapper.class);

	RegistroEntity dtoToEntity(ResponseDto dto);

	ResponseDto entityToDto(RegistroEntity entity);

	List<ResponseDto> listEntityToDto(List<RegistroEntity> listEntity);
}
