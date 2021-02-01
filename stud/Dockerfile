FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/Maven-Docker.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]