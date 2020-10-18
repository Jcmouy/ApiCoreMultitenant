package com.factelcore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factelcore.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
		
	void deleteById(Integer id);
	
	Optional<Usuario> findById(Integer uid);
}
