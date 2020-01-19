package com.example.MuseoBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MuseoBackend.models.Museo;

@Repository
public interface MuseoRepository extends JpaRepository<Museo, Long>{

}
