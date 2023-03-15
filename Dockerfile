FROM amazoncorretto:11-alpine-jdk 
MAINTAINER JEB
COPY target/portfolio-login-0.0.1-SNAPSHOT.jar jeb-app.jar
ENTRYPOINT ["java","-jar","/jeb-app.jar"]  
