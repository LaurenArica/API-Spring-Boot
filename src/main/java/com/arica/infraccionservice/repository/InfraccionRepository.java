package com.arica.infraccionservice.repository;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arica.infraccionservice.entity.Infraccion;


@Repository
public interface InfraccionRepository extends JpaRepository<Infraccion, Integer>{
	List<Infraccion> findByDniContaining(String nombre, Pageable page);
	Infraccion findByDni(String nombre);
}
