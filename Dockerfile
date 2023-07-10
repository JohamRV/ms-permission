FROM openjdk:11
ARG JAR_FILE=target/*.jar
EXPOSE 8082
COPY ${JAR_FILE} ms-permission.jar
ENTRYPOINT ["java","-jar","/ms-permission.jar","--eureka.client.service-url.defaultZone=http://172.18.0.3:8761/eureka","--spring.datasource.url=jdbc:mysql://172.18.0.2:3306/pucp_stack"]