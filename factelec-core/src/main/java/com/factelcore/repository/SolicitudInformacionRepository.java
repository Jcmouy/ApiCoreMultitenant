package com.factelcore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factelcore.entity.SolicitudInformacion;

@Repository
public interface SolicitudInformacionRepository extends JpaRepository<SolicitudInformacion, Integer>{
		
	void deleteById(Integer uid);
	
	SolicitudInformacion getOne(Integer uid);
}
