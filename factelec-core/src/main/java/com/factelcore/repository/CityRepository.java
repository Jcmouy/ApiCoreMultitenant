package com.factelcore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factelcore.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {

    Optional<City> findById(Long id);

    City findByName(String name);

    void deleteByName(String name);
}
