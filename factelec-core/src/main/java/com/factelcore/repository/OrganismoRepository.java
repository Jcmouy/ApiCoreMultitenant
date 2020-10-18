package com.factelcore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factelcore.entity.Organismo;
import com.factelcore.entity.SolicitudInformacion;

@Repository
public interface OrganismoRepository extends JpaRepository<Organismo, Integer>{
		
	void delete(Organismo organismo);
}
