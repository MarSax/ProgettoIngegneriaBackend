package com.example.MuseoBackend.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.example.MuseoBackend.dtos.MuseoDTO;
import com.example.MuseoBackend.mappers.MuseoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MuseoBackend.models.Museo;
import com.example.MuseoBackend.repositories.MuseoRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MuseoServiceImpl {

	@Autowired
	private MuseoRepository museoRepository;

	@Autowired
	private MuseoMapper museoMapper;
	
	public List<MuseoDTO> getListaMusei() {
		return museoRepository.findAll().stream().map(museoMapper::mapIntoDto).collect(Collectors.toList());
	}

	public MuseoDTO getMuseo(Long id) {
		Museo museo = museoRepository.findById(id).orElse(null);
		return museoMapper.mapIntoDto(museo);
	}
	
	public void saveMuseo(MuseoDTO museo) {
		museoRepository.save(museoMapper.mapIntoEntity(museo));
	}

	//da rifare l'update
	public void updateMuseo(Museo museo, Long id) {
		Museo museoWithNewValue = museoRepository.getOne(id);
		museoWithNewValue.setCitta(museo.getCitta());
		museoWithNewValue.setIndirizzo(museo.getIndirizzo());
		museoWithNewValue.setNome(museo.getNome());
		museoRepository.save(museoWithNewValue);
	}
	
	public void eliminaMuseo(Long id) {
		museoRepository.deleteById(id);
	}
	
}
