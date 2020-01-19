package com.example.MuseoBackend.mappers;

import com.example.MuseoBackend.dtos.AutoreDTO;
import com.example.MuseoBackend.models.Autore;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public interface AutoreMapper {

    Autore mapIntoEntity(AutoreDTO autoreDTO);

    AutoreDTO mapIntoDto(Autore autore);
}
