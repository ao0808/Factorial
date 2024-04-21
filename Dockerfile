FROM adoptopenjdk:11-jdk
# Установка Maven
RUN apt-get update && \
    apt-get install -y maven
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -U
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/target/factorial-1.0-SNAPSHOT.jar"]