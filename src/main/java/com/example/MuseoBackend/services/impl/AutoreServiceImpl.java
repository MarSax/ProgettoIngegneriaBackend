package com.example.MuseoBackend.services.impl;

import com.example.MuseoBackend.dtos.AutoreDTO;
import com.example.MuseoBackend.mappers.AutoreMapper;
import com.example.MuseoBackend.repositories.AutoreRepository;
import com.example.MuseoBackend.services.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AutoreServiceImpl implements AutoreService {

    @Autowired
    private AutoreRepository autoreRepository;

    @Autowired
    private AutoreMapper autoreMapper;

    @Override
    public void salvaAutore(AutoreDTO autore) {

        autoreRepository.save(autoreMapper.mapIntoEntity(autore));

    }
}
