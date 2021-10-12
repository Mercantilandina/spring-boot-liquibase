--liquibase formatted sql

--changeset autor:datos-de-usuarios

insert into usuario (id, nombre, email, habilitado) 
value ('42664f0f-dd76-4390-96a5-36182e375f47', 'user1', 'user1@email.com', true);

insert into usuario (id, nombre, email, habilitado) 
value ('d809119f-4518-441d-802e-9599b915993e', 'user2', 'user2@email.com', true);
