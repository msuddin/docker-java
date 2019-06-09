# Sample Docker Java

## Purpose

Question:
What is the purpose of this project?

Answer:
* To build a simple java hello world application
* And create a dockerfile that creates a docker image that run a jar
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
