package com.factelcore.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factelcore.entity.SolicitudServicio;

@Repository
public interface SolicitudServicioRepository extends JpaRepository<SolicitudServicio, Integer>{
		
	void deleteById(Integer id);
	
	Optional<SolicitudServicio> findById(Integer uid);
}
