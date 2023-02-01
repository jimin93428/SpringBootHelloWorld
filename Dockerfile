FROM openjdk:8
EXPOSE 8080
ADD target/private_hub.jar private_hub.jar
ENTRYPOINT ["java", "-jar","/private_hub.jar"]]