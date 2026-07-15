FROM openjdk:17-jdk-slim

COPY target/*.jar order.jar

CMD apt-get update -y

ENTRYPOINT ["java","-jar","/order.jar"]