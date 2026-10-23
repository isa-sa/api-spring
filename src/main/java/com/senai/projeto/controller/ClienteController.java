package com.senai.projeto.controller;

import com.senai.projeto.entity.ClienteEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @PostMapping
    public ResponseEntity<ClienteEntity> criar(@RequestBody ClienteEntity Cliente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(Cliente);
    }

    @GetMapping
    public ResponseEntity<List<ClienteEntity>> listar() {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteEntity> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(new ClienteEntity());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteEntity> atualizar(@PathVariable Long id, @RequestBody ClienteEntity Cliente) {
        return ResponseEntity.ok(Cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }
}