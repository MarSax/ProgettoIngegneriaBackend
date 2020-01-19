package com.example.MuseoBackend.services;

import com.example.MuseoBackend.models.Utente;

public interface UtenteService {

    void save(Utente utente);

    Utente findByUsername(String username);
}
