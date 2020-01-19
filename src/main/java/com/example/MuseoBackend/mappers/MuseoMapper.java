package com.example.MuseoBackend.mappers;

import com.example.MuseoBackend.dtos.MuseoDTO;
import com.example.MuseoBackend.models.Museo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MuseoMapper {

    MuseoMapper mapper = Mappers.getMapper(MuseoMapper.class);

    Museo mapIntoEntity (MuseoDTO museo);

    MuseoDTO mapIntoDto (Museo museo);

}
