FROM amazoncorretto:11-alpine-jdk 
MAINTAINER ezequielbenitez
COPY target/portfolio-login-0.0.1-SNAPSHOT.jar portfolio-login-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/portfolio-login-0.0.1-SNAPSHOT.jar"]  
