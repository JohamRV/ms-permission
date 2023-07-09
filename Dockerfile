FROM openjdk:11
ARG JAR_FILE=target/*.jar
EXPOSE 8082
COPY ${JAR_FILE} ms-permission.jar
ENTRYPOINT ["java","-jar","/ms-permission.jar"]