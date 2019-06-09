# We use the image below as a baseline to our image
FROM openjdk:12-alpine

# Copy all the files needed
ADD build/libs/sample-docker-java-1.0-SNAPSHOT.jar sample-docker-java.jar

# Run commands
CMD java -jar sample-docker-java.jar