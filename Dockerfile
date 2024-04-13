FROM openjdk:17.0.1

LABEL authors="Anindya Das"

WORKDIR /app

COPY target/docker-demo-0.0.1-SNAPSHOT.jar docker-demo.jar

EXPOSE 9555

CMD ["java", "-jar", "docker-demo.jar"]