# Step 1: Use a lightweight Java Runtime as the base image
FROM eclipse-temurin:11-jre-alpine

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the compiled .jar file from your TeamCity build output
# Note: TeamCity's Maven build puts the jar in the 'target' folder
COPY target/*.jar app.jar

# Step 4: Tell the container how to run your application
ENTRYPOINT ["java", "-jar", "app.jar"]
