package com.example.MuseoBackend.controllers;

import com.example.MuseoBackend.dtos.MuseoDTO;
import com.example.MuseoBackend.models.Museo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.MuseoBackend.services.impl.MuseoServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/musei")
public class MuseoController {

    @Autowired
    private MuseoServiceImpl museoServiceImpl;

    @GetMapping
    public ResponseEntity<List<MuseoDTO>> getMusei() {
        return ResponseEntity.ok(museoServiceImpl.getListaMusei());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MuseoDTO> getMuseo(@PathVariable("id") Long id) {
        return ResponseEntity.ok(museoServiceImpl.getMuseo(id));
    }

    @PostMapping
    public ResponseEntity saveMuseo(@RequestBody MuseoDTO museo) {
        museoServiceImpl.saveMuseo(museo);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateMuseo(@PathVariable("id") Long id, @RequestBody Museo museo) {
        museoServiceImpl.updateMuseo(museo,id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteMuseo(@PathVariable("id") Long id) {
        museoServiceImpl.eliminaMuseo(id);
        return ResponseEntity.noContent().build();
    }

}
