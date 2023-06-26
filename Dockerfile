FROM amazoncorretto:8-alpine-jdk 
MAINTAINER ezequielpiki23
COPY  target/portfolio-login-0.0.1-SNAPSHOT.jar ezequielpiki23.jar
ENTRYPOINT ["java","-jar","/ezequielpiki23.jar"]  
