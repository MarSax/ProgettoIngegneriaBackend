package com.example.MuseoBackend.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.example.MuseoBackend.dtos.OperaDTO;
import com.example.MuseoBackend.mappers.AutoreMapper;
import com.example.MuseoBackend.mappers.OperaMapper;
import com.example.MuseoBackend.repositories.AutoreRepository;
import com.example.MuseoBackend.repositories.MuseoRepository;
import com.example.MuseoBackend.services.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MuseoBackend.models.Opera;
import com.example.MuseoBackend.repositories.OperaRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OperaServiceImpl {

	@Autowired
	private OperaRepository operaRepository;

	@Autowired
	private MuseoRepository museoRepository;

	@Autowired
	private OperaMapper operaMapper;
	
	public List<OperaDTO> getListaOpereByIdMuseo(Long idMuseo) {
		return operaRepository.findAllByMuseo(idMuseo).stream().map(operaMapper::mapIntoDto).collect(Collectors.toList());
	}
	
	public OperaDTO getOpera(Long idMuseo, Long idOpera) {
		Opera opera = operaRepository.findByIdOperaAndIdMuseo(idMuseo, idOpera);
		return operaMapper.mapIntoDto(opera);
	}
	
	public void salvaOpera(OperaDTO opera) {
		operaRepository.save(operaMapper.mapIntoEntity(opera));
	}
	
	public void aggiornaOpera(Opera opera, Long id) {
		Opera oldOperaWithNewValue = operaRepository.getOne(id);
		oldOperaWithNewValue.setNome(opera.getNome());
		oldOperaWithNewValue.setDescrizioneBreve(opera.getDescrizioneBreve());
		oldOperaWithNewValue.setDescrizioneLunga(opera.getDescrizioneLunga());
		operaRepository.save(oldOperaWithNewValue);
	}
	
	public void deleteOpera(Long id) {
		operaRepository.deleteById(id);
	}
}
