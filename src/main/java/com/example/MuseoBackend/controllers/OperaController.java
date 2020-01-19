package com.example.MuseoBackend.controllers;

import com.example.MuseoBackend.dtos.OperaDTO;
import com.example.MuseoBackend.models.Opera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.MuseoBackend.services.impl.MuseoServiceImpl;
import com.example.MuseoBackend.services.impl.OperaServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/musei/{idMuseo}/opere")
public class OperaController {

    @Autowired
    private OperaServiceImpl operaServiceImpl;

    @Autowired
    private MuseoServiceImpl museoServiceImpl;

    @GetMapping
    public ResponseEntity<List<OperaDTO>> getOpere(@PathVariable("idMuseo") Long idMuseo) {
        return ResponseEntity.ok(operaServiceImpl.getListaOpereByIdMuseo(idMuseo));
    }

    @GetMapping("/{idOpera}")
    public ResponseEntity<OperaDTO> getOpera(@PathVariable("idMuseo") Long idMuseo, @PathVariable("idOpera") Long idOpera) {
        return ResponseEntity.ok(operaServiceImpl.getOpera(idMuseo, idOpera));
    }

    @PostMapping
    public ResponseEntity saveOpera(@RequestBody OperaDTO opera) {
        operaServiceImpl.salvaOpera(opera);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateOpera(@PathVariable("id") Long idOpera, @RequestBody Opera opera) {
        operaServiceImpl.aggiornaOpera(opera, idOpera);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteOpera(@PathVariable("id") Long idOpera) {
        operaServiceImpl.deleteOpera(idOpera);
        return ResponseEntity.noContent().build();
    }

}
