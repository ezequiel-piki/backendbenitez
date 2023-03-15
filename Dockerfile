FROM amazoncorretto:11-alpine-jdk //de que img de java partimos
MAINTAINER EZEBenitez //dueño
COPY target/portfolio-login-0.0.1-SNAPSHOT.jar eze-benitez.jar
ENTRYPOINT["java","-jar","/eze-benitez.jar"] //es la instrucción que se va a ejecutar primero
