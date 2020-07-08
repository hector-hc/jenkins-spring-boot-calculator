FROM openjdk:8-jre
COPY target/jenkins-spring-boot-calculator-1.0.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]