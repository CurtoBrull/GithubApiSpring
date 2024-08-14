# GitHub User Activity App

## Descripción

La **GitHub User Activity App** es una aplicación web desarrollada con Spring Boot que permite buscar y visualizar información detallada sobre los usuarios de GitHub. Utilizando la API pública de GitHub, esta aplicación proporciona detalles como el nombre, ubicación, biografía, número de seguidores, repositorios públicos y más.

Está alojada en Render y es accesible públicamente en la siguiente URL: [https://githubapispring.onrender.com/](https://githubapispring.onrender.com/)

## Características

- Búsqueda de usuarios por nombre de usuario de GitHub.
- Visualización de detalles del perfil de GitHub, incluyendo:
    - Avatar
    - Nombre de usuario
    - Nombre real
    - Ubicación
    - Biografía
    - Número de seguidores y seguidos
    - Número de repositorios públicos
- Enlace directo al perfil de GitHub del usuario.
- Interfaz de usuario sencilla, la app se centra en el backend con spring.

## Tecnologías Utilizadas

- **Java 17**: Lenguaje de programación.
- **Spring Boot**: Framework para el desarrollo backend.
- **Thymeleaf**: Motor de plantillas para renderizar el frontend.
- **WebClient**: Para realizar las llamadas a la API de GitHub.
- **Railway**: Plataforma utilizada para desplegar la aplicación.
- **GitHub API**: API utilizada para obtener la información de los usuarios.

## Configuración Local

### Requisitos Previos

- JDK 17 o superior
- Maven 3.8 o superior
- Una cuenta de GitHub para acceder a la API (opcional)

### Pasos para Ejecutar la Aplicación Localmente

1. **Clona el repositorio:**

   ```bash
   git clone https://github.com/CurtoBrull/GithubApiSpring

2. **Configura las propiedades de la aplicación:**

    Si necesitas configurar alguna variable específica, edita el archivo: 
    ```bash
    src/main/resources/application.properties.

3. **Ejecuta la aplicación:**

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
4. **Accede a la aplicación:**

   Abre un navegador web y accede a la URL: [http://localhost:8080](http://localhost:8080)

## Despliegue en Render

La aplicación está desplegada en Render y es accesible públicamente en la siguiente URL:

[https://githubapispring.onrender.com/](https://githubapispring.onrender.com/)

Railway se encarga de asignar el puerto automáticamente y proporciona una URL pública para acceder a la aplicación.

## Uso
  
1. Visita la URL de la aplicación. [https://githubapispring.onrender.com/](https://githubapispring.onrender.com/)
2. Introduce un nombre de usuario de GitHub en el campo de búsqueda.
3. Haz clic en "Buscar" para obtener los detalles del usuario.
4. Visualiza la información y haz clic en el enlace para ver el perfil completo en GitHub.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, sigue los siguientes pasos:

1. Haz un fork del proyecto.
2. Crea una nueva rama (git checkout -b feature/nueva-feature).
3. Realiza tus cambios y haz commit (git commit -am 'Agrega nueva feature').
4. Push de la rama (git push origin feature/nueva-feature).
5. Abre un Pull Request.

## Autor: 
### **Javier Curto Brull**


## Contacto:
### **curto.brull.javier@jcurtobr.eu**