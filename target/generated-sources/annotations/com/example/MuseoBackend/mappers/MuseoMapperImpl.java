package com.example.MuseoBackend.mappers;

import com.example.MuseoBackend.dtos.MuseoDTO;
import com.example.MuseoBackend.models.Museo;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-19T12:58:10+0100",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 11.0.3 (JetBrains s.r.o)"
)
@Component
public class MuseoMapperImpl implements MuseoMapper {

    @Override
    public Museo mapIntoEntity(MuseoDTO museo) {
        if ( museo == null ) {
            return null;
        }

        Museo museo1 = new Museo();

        museo1.setId( museo.getId() );
        museo1.setNome( museo.getNome() );
        museo1.setIndirizzo( museo.getIndirizzo() );
        museo1.setCitta( museo.getCitta() );

        return museo1;
    }

    @Override
    public MuseoDTO mapIntoDto(Museo museo) {
        if ( museo == null ) {
            return null;
        }

        MuseoDTO museoDTO = new MuseoDTO();

        museoDTO.setId( museo.getId() );
        museoDTO.setNome( museo.getNome() );
        museoDTO.setIndirizzo( museo.getIndirizzo() );
        museoDTO.setCitta( museo.getCitta() );

        return museoDTO;
    }
}
