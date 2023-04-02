FROM openjdk:8
ARG JAR_FILE=target/springbootapptutorial-0.0.1.jar
COPY ${JAR_FILE} springbootapptutorial.jar
ENTRYPOINT ["java","-jar","/springbootapptutorial.jar"]
EXPOSE 8080