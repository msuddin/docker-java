# Sample Docker Java

## Purpose

Question:
What is the purpose of this project?

Answer:
* To build a simple java hello world application
* And create a dockerfile that creates a docker image (that run's a jar)
* A running instance of a docker image is called a container
* In build.gradle file, to add an entry point for the 'main method' in the jar every time gradle build

## Instructions on running

### To run using 'Docker Build and Docker Run'

From the root directory of the project
Clean the project and build it
```
./gradlew clean build
```
Build the docker images
```
docker build --tag 'sample-docker-java' .
```
Run the docker container
```
docker run sample-docker-java
```
### To run using 'Docker Compose'

From the root directory of the project
Clean the project and build it
```
./gradlew clean build
```
Run docker-compose (the compose file will run two docker containers at the same time - two instances of the same application)

```
docker-compose up
```
* That will run the docker-compose.yml file instead which will run a docker container
* Have found that any files mentioned in dockerfile or docker-compose.yml need to be in child directory of the docker files


## Notes

### Useful Docker Commands

```
// Stop all Docker containers
docker stop $(docker ps -aq) && docker rm $(docker ps -aq)

// Remove all Docker Images
docker rmi $(docker images)
```

### For Windows
You may want to set the following command if docker-compose throws back a tls issue:
```
SET COMPOSE_TLS_VERSION=TLSv1_2
```