
# Demo de Spring Boot con Liquibase

Esta aplicación demuestra cómo utilizar Liquibase para crear las tablas de bases de datos de forma automática. 

## Ejecutar la aplicación

La aplicación requiere tener un motor de base de datos MaríaDB. Podemos iniciar un contenedor de Docker con el siguiente comando:

```
docker-compose -f docker\docker-compose.yml up -d
```

Luego ingresar el siguiente comando para iniciar la aplicación:

```
mvn spring-boot:run
```

Cuando la aplicación se inicia se observa que Liquibase entra en acción y aplica todos los cambios en la base de datos.

## Consultar los cambios de Liquibase

Para consultas las acciones ejecutadas por Liquibase ingresar en el contenedor de MariaDB, ingresando el siguiente comando:

```
docker exec -it mariadb-liquibase sh
```

Dentro del contenedor ingresar en el motor de base de datos:

```
mariadb -u spring -p
```

Ejecutar la consulta SQL para listar los cambios:

```
select * from demo.DATABASECHANGELOG;
```


