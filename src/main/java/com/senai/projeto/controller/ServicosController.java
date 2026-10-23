package com.senai.projeto.controller;

import com.senai.projeto.entity.ServicosEntity; // Certifique-se do nome exato da sua classe Servicos
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicosController {

    @PostMapping
    public ResponseEntity<ServicosEntity> criar(@RequestBody ServicosEntity servicos) {
        return ResponseEntity.status(HttpStatus.CREATED).body(servicos);
    }

    @GetMapping
    public ResponseEntity<List<ServicosEntity>> listar() {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServicosEntity> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(new ServicosEntity());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServicosEntity> atualizar(@PathVariable Long id, @RequestBody ServicosEntity servicos) {
        return ResponseEntity.ok(servicos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }
}