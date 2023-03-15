FROM amazoncorretto:11-alpine-jdk 
MAINTAINER EZEBenitez 
COPY target/portfolio-login-0.0.1-SNAPSHOT.jar eze-benitez.jar
ENTRYPOINT ["java","-jar","/ezebenitez-app.jar"]  
