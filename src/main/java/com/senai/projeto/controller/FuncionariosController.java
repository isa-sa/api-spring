package com.senai.projeto.controller;

import com.senai.projeto.entity.FuncionariosEntity; // Certifique-se do nome exato da sua classe Funcionarios
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionariosController {

    @PostMapping
    public ResponseEntity<FuncionariosEntity> criar(@RequestBody FuncionariosEntity funcionarios) {
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarios);
    }

    @GetMapping
    public ResponseEntity<List<FuncionariosEntity>> listar() {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FuncionariosEntity> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(new FuncionariosEntity());
    }

    @PutMapping("/{id}")
    public ResponseEntity<FuncionariosEntity> atualizar(@PathVariable Long id, @RequestBody FuncionariosEntity funcionarios) {
        return ResponseEntity.ok(funcionarios);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }
}