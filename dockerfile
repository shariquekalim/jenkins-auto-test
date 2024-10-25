# Use a base image with Java 17
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/Project-for-docker-0.0.1-SNAPSHOT.jar app.jar

# Expose the port Spring Boot runs on
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
