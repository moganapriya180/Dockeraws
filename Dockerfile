FROM eclipse-temurin:17
COPY target/automationaws.jar automationaws.jar 
CMD [ "java", "-jar","automationaws.jar"]