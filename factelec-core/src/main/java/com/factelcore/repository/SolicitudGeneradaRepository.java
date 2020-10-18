package com.factelcore.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factelcore.entity.SolicitudGenerada;
import com.factelcore.entity.SolicitudInformacion;

@Repository
public interface SolicitudGeneradaRepository extends JpaRepository<SolicitudGenerada, Integer>{
		
	void deleteById(Integer id);
	
	Optional<SolicitudGenerada> findById(Integer uid);
}
