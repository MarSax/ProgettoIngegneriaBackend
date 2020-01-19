package com.example.MuseoBackend.repositories;

import com.example.MuseoBackend.models.Autore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoreRepository extends JpaRepository<Autore, Long> {
}
