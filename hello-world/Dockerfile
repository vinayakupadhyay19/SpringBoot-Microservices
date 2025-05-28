FROM openjdk:18.0-slim
COPY target/*.jar app.jar
EXPOSE 5001
ENTRYPOINT ["java","-jar","/app.jar"]