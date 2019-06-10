# Sample Docker Java

## Purpose

Question:
What is the purpose of this project?

Answer:
* To build a simple java hello world application
* And create a dockerfile that creates a docker image (that run's a jar)
* A running instance of a docker image is called a container
* In build.gradle file, to add an entry point for the 'main method' in the jar every time gradle build
* The following three commands are then run 

```
// Build the Jar which contains an entry point to the maind method
gradle clean build

// Build a Docker Image using a docker file - this copies in the jar on the image
docker build --tag 'sample-docker-java' .

// Run the Docker image which explicitly runs the java jar
docker run sample-docker-java
```
* Instead of running docker build and docker run above, can use the docker-compose up instead
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