FROM openjdk:14-alpine
COPY target/spring-jit-*.jar spring-jit.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "spring-jit.jar"]