package com.ma.liquibase.domain;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositoryJPA extends JpaRepository<UsuarioEntity, String> {
    Optional<UsuarioEntity> findByNombre(String nombre);
}

