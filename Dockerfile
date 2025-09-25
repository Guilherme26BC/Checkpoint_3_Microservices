FROM maven:3.9.11-eclipse-temurin-17
COPY . opt/app

WORKDIR /opt/app

RUN mvn clean package

CMD ["java", "-jar", "target/checkpoint-1-0.0.1-SNAPSHOT.jar"]
