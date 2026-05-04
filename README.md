# SPRING RABBITMQ DOCKER IMAGE

Esqueleto de Spring Boot con RabbitMQ utilizando servidor de RabbitMQ en Docker.

## Instalación

Ejecutar el siguiente comando para instalar la imagen del servidor de RabbitMQ en Docker:
````
docker run -d --restart always --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management
````

Crear una nueva cola llamada "cola1" o cambiarlo en application.properties

