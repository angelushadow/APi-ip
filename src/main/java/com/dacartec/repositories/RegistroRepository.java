package com.dacartec.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dacartec.entity.RegistroEntity;

@Repository
public interface RegistroRepository extends JpaRepository<RegistroEntity, Long> {
	List<RegistroEntity> findByPais(String pais);
}
