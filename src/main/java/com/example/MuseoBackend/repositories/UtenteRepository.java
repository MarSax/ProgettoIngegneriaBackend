package com.example.MuseoBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MuseoBackend.models.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long>{

	Utente findByUsername(String username);
	
}
