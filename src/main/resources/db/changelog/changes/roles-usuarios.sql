--liquibase formatted sql

--changeset autor:datos-roles

insert into rol(nombre, descripcion)
value ('admin', 'Administrador del grupo');

insert into rol(nombre, descripcion)
value ('external', 'Usuario externo');

insert into rol(nombre, descripcion)
value ('invitado', 'Usuario invitado');

insert into rol(nombre, descripcion)
value ('owner', 'Usuario dueño del grupo');

--liquibase formatted sql

--changeset autor:datos-roles-usuarios

insert into rolusuario(usuario_id, rol_nombre)
value ('42664f0f-dd76-4390-96a5-36182e375f47', 'admin');

insert into rolusuario(usuario_id, rol_nombre)
value ('42664f0f-dd76-4390-96a5-36182e375f47', 'owner');

insert into rolusuario(usuario_id, rol_nombre)
value ('d809119f-4518-441d-802e-9599b915993e', 'external');

insert into rolusuario(usuario_id, rol_nombre)
value ('d809119f-4518-441d-802e-9599b915993e', 'invitado');
