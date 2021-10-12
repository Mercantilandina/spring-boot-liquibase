package com.ma.liquibase.web;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

import com.ma.liquibase.domain.UsuarioEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponse {

    private String id;
    private String nombre;
    private String email;
    private LocalDateTime creado;
    private Set<RolResponse> roles;

    public static UsuarioResponse fromDomin(UsuarioEntity entity) {
        return new UsuarioResponse(
                     entity.getId(), 
                     entity.getNombre(), 
                     entity.getEmail(), 
                     entity.getCreado(),
                     mapRoles(entity));
    }

    private static Set<RolResponse> mapRoles(UsuarioEntity entity) {
        return entity
                 .getRoles()
                 .stream()
                 .map(RolResponse::fromDomain)
                 .collect(Collectors.toSet());
    }
    
}
