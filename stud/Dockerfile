FROM openjdk:8
ADD target/Maven-Docker.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8080