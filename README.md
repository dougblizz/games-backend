games-backend
=================

### Comments
Se uso Spring Boot para manejar datos provenientes de una base de datos Mysql, y Hibernate para la conexión con la bd, si desea correr el backend de forma standalone debe eliminar el provided en el `<scope>` de la dependencia tomcat.

```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-tomcat</artifactId>
	<scope>provided</scope>
</dependency>
```
El script de la base de datos está en la carpeta: /src/main/resources/sql/scripts

### Build commands:
```
mvnw clean package
```

### Deployment:
.war

### API Urls:
```
[GET] http://localhost:8080/games/games
```