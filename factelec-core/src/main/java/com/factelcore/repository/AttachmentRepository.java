package com.factelcore.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factelcore.entity.Attachment;
import com.factelcore.entity.City;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment,Long> {
	
	Optional<Attachment> findById(Long id);
	
}
