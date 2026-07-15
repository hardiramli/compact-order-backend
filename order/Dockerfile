FROM amazoncorretto:17

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} order-0.0.1-SNAPSHOT.jar

CMD apt-get update -y

ENTRYPOINT ["java","-jar","order-0.0.1-SNAPSHOT.jar"]