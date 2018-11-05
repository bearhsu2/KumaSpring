FROM openjdk:8-jdk-alpine

EXPOSE 8080

ARG JAR_FILE=spring-boot-web-mustache-1.0.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
