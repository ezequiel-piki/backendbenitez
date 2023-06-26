FROM amazoncorretto:8-alpine3.17-jdk
LABEL manteiner="ezequielpiki23"
COPY  target/portfolio-login-0.0.1-SNAPSHOT.jar portfolio-login-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","portfolio-login-0.0.1-SNAPSHOT.jar"]  
