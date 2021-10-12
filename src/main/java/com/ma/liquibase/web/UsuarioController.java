package com.ma.liquibase.web;

import com.ma.liquibase.domain.UsuarioRepositoryJPA;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    private final UsuarioRepositoryJPA repository;

    public UsuarioController(UsuarioRepositoryJPA repository) {
        this.repository = repository;
    }

    @GetMapping("/usuarios/{nombre}")
    public ResponseEntity<UsuarioResponse> consultar(@PathVariable String nombre) {
        return repository.findByNombre(nombre)
             .map(UsuarioResponse::fromDomin)
             .map(respuesta -> ResponseEntity.ok().body(respuesta))
             .orElse(ResponseEntity.notFound().build());
    }
}
