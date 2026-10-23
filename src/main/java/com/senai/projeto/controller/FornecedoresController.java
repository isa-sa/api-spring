package com.senai.projeto.controller;

import com.senai.projeto.entity.FornecedoresEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedoresController {

    @PostMapping
    public ResponseEntity<FornecedoresEntity> criar(@RequestBody FornecedoresEntity fornecedores) {
        return ResponseEntity.status(HttpStatus.CREATED).body(fornecedores);
    }

    @GetMapping
    public ResponseEntity<List<FornecedoresEntity>> listar() {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FornecedoresEntity> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(new FornecedoresEntity());
    }

    @PutMapping("/{id}")
    public ResponseEntity<FornecedoresEntity> atualizar(@PathVariable Long id, @RequestBody FornecedoresEntity fornecedores) {
        return ResponseEntity.ok(fornecedores);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }
}