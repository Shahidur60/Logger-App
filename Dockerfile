# Base image with Java
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the application JAR file
COPY target/TestLogger-0.0.1-SNAPSHOT-jar-with-dependencies.jar /app/TestLogger.jar

# Copy the Java agent JAR file
COPY target/instrumentation-0.0.1-SNAPSHOT-jar-with-dependencies.jar /app/instrumentation.jar

# Run the application with the Java agent
CMD ["java", "-javaagent:/app/instrumentation.jar", "-jar", "TestLogger.jar"]
