Proyecto: Módulo de Usuarios – Process Standard

Este repositorio contiene el desarrollo del módulo de usuarios del sistema Process Standard, construido con Spring Boot, Java, y MySQL. El proyecto forma parte de la evidencia GA7-220501096-AA3-EV01 del programa de formación en Análisis y Desarrollo de Software (SENA).

Funcionalidades principales
	•	Registro, consulta, actualización y eliminación de usuarios.
	•	Conexión a base de datos relacional MySQL usando JPA (Hibernate).
	•	API RESTful con endpoints /api/usuarios.
	•	Manejo correcto de codificación de caracteres (UTF-8 y utf8mb4).
	•	Control de errores y respuesta en formato JSON.
	•	Proyecto estructurado con buenas prácticas (modelo, repositorio, servicio y controlador).

Tecnologías usadas
	•	Java 11
	•	Spring Boot 2.7.18
	•	MySQL 8
	•	Maven
	•	VS Code / Spring Tools
	•	Thunder Client / navegador para pruebas

Estructura del proyecto

    ├── src
│   └── main
│       ├── java
│       │   └── com.processstandard.usuarios
│       │       ├── model
│       │       ├── repository
│       │       ├── service
│       │       ├── controller
│       │       └── UsuariosApplication.java
│       └── resources
│           └── application.properties
├── pom.xml

Autor

Jaime Orlando Estupiñán
Aprendiz – SENA
