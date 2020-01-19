package com.example.MuseoBackend.mappers;

import com.example.MuseoBackend.dtos.OperaDTO;
import com.example.MuseoBackend.models.Museo;
import com.example.MuseoBackend.models.Opera;
import com.example.MuseoBackend.models.Utente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OperaMapper {

    OperaMapper mapper = Mappers.getMapper(OperaMapper.class);

    Opera mapIntoEntity (OperaDTO opera);

    OperaDTO mapIntoDto (Opera opera);
}
