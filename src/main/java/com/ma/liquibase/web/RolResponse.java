package com.ma.liquibase.web;

import com.ma.liquibase.domain.RolEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolResponse {

    private String nombre;
    private String descripcion;

    public static RolResponse fromDomain(RolEntity entity) {
        return new RolResponse(entity.getNombre(), entity.getDescripcion());
    }
    
}
