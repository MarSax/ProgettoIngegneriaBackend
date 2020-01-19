package com.example.MuseoBackend.mappers;

import com.example.MuseoBackend.dtos.AutoreDTO;
import com.example.MuseoBackend.models.Autore;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-19T12:58:10+0100",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 11.0.3 (JetBrains s.r.o)"
)
@Component
public class AutoreMapperImpl implements AutoreMapper {

    @Override
    public Autore mapIntoEntity(AutoreDTO autoreDTO) {
        if ( autoreDTO == null ) {
            return null;
        }

        Autore autore = new Autore();

        autore.setId( autoreDTO.getId() );
        autore.setNome( autoreDTO.getNome() );
        autore.setCognome( autoreDTO.getCognome() );
        autore.setDataDiNascita( autoreDTO.getDataDiNascita() );
        autore.setLuogoDiNascita( autoreDTO.getLuogoDiNascita() );

        return autore;
    }

    @Override
    public AutoreDTO mapIntoDto(Autore autore) {
        if ( autore == null ) {
            return null;
        }

        AutoreDTO autoreDTO = new AutoreDTO();

        autoreDTO.setId( autore.getId() );
        autoreDTO.setNome( autore.getNome() );
        autoreDTO.setCognome( autore.getCognome() );
        autoreDTO.setDataDiNascita( autore.getDataDiNascita() );
        autoreDTO.setLuogoDiNascita( autore.getLuogoDiNascita() );

        return autoreDTO;
    }
}
