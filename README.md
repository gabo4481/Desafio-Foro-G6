# Challenge Back End - ForoHub

¡Bienvenido a último desafío Back End del programa Oracle Next Education!

## Introducción

Un foro es un espacio donde todos los participantes de una plataforma pueden plantear sus preguntas sobre determinados tópicos. Por ejemplo en alura latam, los estudiantes utilizan el foro para aclarar sus dudas sobre los cursos y proyectos en los que participan. Este lugar mágico está lleno de aprendizaje y colaboración entre estudiantes, profesores y moderadores.

### ¿Cómo funciona un foro detrás de escena?

Sabemos para qué sirve un foro y conocemos su aspecto, pero ¿cómo se maneja detrás de escena? ¿Dónde se almacenan las informaciones? ¿Cómo se relacionan los datos de un tópico con una respuesta, o cómo se relacionan los usuarios con las respuestas de un tópico?

Este es nuestro desafío, llamado **ForoHub**: replicar este proceso a nivel de back end. Para ello, crearemos una API REST usando Spring.

## Funcionalidades de la API

Nuestra API se centrará específicamente en los tópicos, permitiendo a los usuarios realizar las siguientes acciones:

- **Crear un nuevo tópico**
- **Mostrar todos los tópicos creados**
- **Mostrar un tópico específico**
- **Actualizar un tópico**
- **Eliminar un tópico**
- **Pronto otras rutas**

Esto conforma lo que comúnmente conocemos como CRUD (Create, Read, Update, Delete).

## Objetivos del Challenge

El objetivo de este desafío es implementar una API REST con las siguientes funcionalidades:

1. **API con rutas implementadas siguiendo las mejores prácticas del modelo REST**
2. **Validaciones realizadas según las reglas de negocio**
3. **Implementación de una base de datos relacional para la persistencia de la información**
4. **Servicio de autenticación/autorización para restringir el acceso a la información**

## Configuración del Entorno de Desarrollo

Para iniciar el desarrollo de **ForoHub**, asegúrate de tener los siguientes programas, archivos y versiones:

- **Java JDK**: versión 17 en adelante - [Descarga la última versión LTS de Java gratuita](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Maven**: versión 4 en adelante
- **Spring Boot**: versión 3 en adelante - [Spring Initializr](https://start.spring.io/)
- **MySQL**: versión 8 en adelante - [Instalador para Windows](https://dev.mysql.com/downloads/installer/)
- **IDE**: IntelliJ IDEA (opcional)

### Configuración al crear el proyecto con Spring Initializr:

- **Java**: versión 17 en adelante
- **Maven**: versión 4
- **Spring Boot**: versión 3
- **Proyecto**: Formato JAR

### Dependencias para agregar al crear el proyecto con Spring Initializr:

- Lombok
- Spring Web
- Spring Boot DevTools
- Spring Data JPA
- Flyway Migration
- MySQL Driver
- Validation
- Spring Security

## Instalación de MySQL

Para la construcción de la base de datos de **ForoHub**, consulta los siguientes recursos importantes:

- [Descarga el instalador para Windows](https://dev.mysql.com/downloads/installer/)
- [Guía de instalación de MySQL en Windows](https://www.aluracursos.com/blog/mysql-desde-la-descarga-e-instalacion-hasta-su-primera-tabla)

## Configuración del Proyecto

Para integrar una base de datos en nuestro proyecto Spring, debemos agregar las siguientes dependencias en nuestro `pom.xml` (en caso de que no se hayan agregado durante la configuración inicial):

- Validation
- MySQL Driver
- Spring Data JPA
- Flyway Migration

Además, debemos configurar el archivo `application.properties` con los datos de URL, nombre de usuario y contraseña de nuestra base de datos, incluyendo el driver de la base de datos, y las credenciales de inicio de sesión.

### Ejemplo de `application.properties`

```properties
spring.application.name=ForoAlura

spring.datasource.url=${DATASOURCE_URL}
spring.datasource.username=${DATASOURCE_USER}
spring.datasource.password=${DATASOURCE_PASSWORD}

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

server.error.include-stacktrace=never

api.security.secret=${JWT_SECRET:123456}
```
## CONTACTO
Para cualquier consulta o sugerencia, no dudes en contactarme:

LinkedIn: [Gabriel Mendoza](https://www.linkedin.com/in/gabriel-mendoza-devolver/)
Correo electrónico: gab65149@gmail.com


