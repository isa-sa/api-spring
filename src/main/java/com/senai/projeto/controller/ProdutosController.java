package com.senai.projeto.controller;

import com.senai.projeto.entity.ProdutosEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {

    @PostMapping
    public ResponseEntity<ProdutosEntity> criar(@RequestBody ProdutosEntity produtos) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtos);
    }

    @GetMapping
    public ResponseEntity<List<ProdutosEntity>> listar() {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutosEntity> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(new ProdutosEntity());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutosEntity> atualizar(@PathVariable Long id, @RequestBody ProdutosEntity produtos) {
        return ResponseEntity.ok(produtos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }
}