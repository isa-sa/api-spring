package com.senai.projeto.controller;

import com.senai.projeto.entity.PetsEntity; // Certifique-se do nome exato da sua classe Pets
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetsController {

    @PostMapping
    public ResponseEntity<PetsEntity> criar(@RequestBody PetsEntity Pets) {
        return ResponseEntity.status(HttpStatus.CREATED).body(Pets);
    }

    @GetMapping
    public ResponseEntity<List<PetsEntity>> listar() {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PetsEntity> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(new PetsEntity());
    }

    @PutMapping("/{id}")
    public ResponseEntity<PetsEntity> atualizar(@PathVariable Long id, @RequestBody PetsEntity pets) {
        return ResponseEntity.ok(pets);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }
}