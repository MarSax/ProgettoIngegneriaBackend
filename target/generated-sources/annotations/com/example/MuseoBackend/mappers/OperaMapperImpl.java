package com.example.MuseoBackend.mappers;

import com.example.MuseoBackend.dtos.AutoreDTO;
import com.example.MuseoBackend.dtos.MuseoDTO;
import com.example.MuseoBackend.dtos.OperaDTO;
import com.example.MuseoBackend.models.Autore;
import com.example.MuseoBackend.models.Museo;
import com.example.MuseoBackend.models.Opera;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-19T12:58:10+0100",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 11.0.3 (JetBrains s.r.o)"
)
@Component
public class OperaMapperImpl implements OperaMapper {

    @Override
    public Opera mapIntoEntity(OperaDTO opera) {
        if ( opera == null ) {
            return null;
        }

        Opera opera1 = new Opera();

        opera1.setNome( opera.getNome() );
        opera1.setAutore( autoreDTOToAutore( opera.getAutore() ) );
        opera1.setMuseo( museoDTOToMuseo( opera.getMuseo() ) );
        opera1.setDescrizioneBreve( opera.getDescrizioneBreve() );
        opera1.setDescrizioneLunga( opera.getDescrizioneLunga() );

        return opera1;
    }

    @Override
    public OperaDTO mapIntoDto(Opera opera) {
        if ( opera == null ) {
            return null;
        }

        OperaDTO operaDTO = new OperaDTO();

        operaDTO.setNome( opera.getNome() );
        operaDTO.setAutore( autoreToAutoreDTO( opera.getAutore() ) );
        operaDTO.setDescrizioneBreve( opera.getDescrizioneBreve() );
        operaDTO.setDescrizioneLunga( opera.getDescrizioneLunga() );
        operaDTO.setMuseo( museoToMuseoDTO( opera.getMuseo() ) );

        return operaDTO;
    }

    protected Autore autoreDTOToAutore(AutoreDTO autoreDTO) {
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

    protected Museo museoDTOToMuseo(MuseoDTO museoDTO) {
        if ( museoDTO == null ) {
            return null;
        }

        Museo museo = new Museo();

        museo.setId( museoDTO.getId() );
        museo.setNome( museoDTO.getNome() );
        museo.setIndirizzo( museoDTO.getIndirizzo() );
        museo.setCitta( museoDTO.getCitta() );

        return museo;
    }

    protected AutoreDTO autoreToAutoreDTO(Autore autore) {
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

    protected MuseoDTO museoToMuseoDTO(Museo museo) {
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
