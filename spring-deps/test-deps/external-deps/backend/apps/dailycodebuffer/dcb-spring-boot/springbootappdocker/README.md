# Link
http://localhost:8080/message?user=Pushkar

# Name
Docker - Dockerizing your Spring Boot Application | Java Techie

# Youtube Link
https://www.youtube.com/watch?v=e3YERpG2rMs

# spring-boot-dockerize
How to Dockerize Spring Boot Application 

# Build Docker Image 
$ docker build -t spring-boot-docker.jar .

# Check Docker Image 
$ docker image ls

# Run Docker Image 
$ docker run -p 9090:8080 spring-boot-docker.jar

In the run command, we have specified that the port 8080 on the container should be mapped to the port 7001 on the Host OS.

docker build -t springbootappdocker.jar .
docker image ls
docker run -p 7001:8080 springbootappdocker.jar
http://localhost:7001/message

docker container ls -a
docker image ls -a

docker container stop <container-id>

docker rmi -f <image-id>
docker rm -f <container-id>

