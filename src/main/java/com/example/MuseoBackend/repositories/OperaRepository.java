package com.example.MuseoBackend.repositories;

import com.example.MuseoBackend.models.Museo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.MuseoBackend.models.Opera;

import java.util.List;

@Repository
public interface OperaRepository extends JpaRepository<Opera, Long>{

    @Query("SELECT o FROM Opera o WHERE Id_museo = ?1")
    List<Opera> findAllByMuseo(Long idMuseo);

    @Query("SELECT o FROM Opera o WHERE Id_museo = ?1 AND Id = ?2")
    Opera findByIdOperaAndIdMuseo(Long idMuseo, Long idOpera);


}
