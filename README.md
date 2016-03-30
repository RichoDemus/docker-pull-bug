# Docker-client pull bug

## What is this?
For some reason, docker pull seems to leave a non-daemon thread behind, prevent the jvm from shutting down right away  
But not when running it as a junit test

## reproduce
### just using maven
`mvn compile && time mvn exec:java -Dexec.mainClass="com.richodemus.test.docker.bug.DockerImagePuller"`
### Using IDE:
1. run DockerImagePuller.main(), the image will be downloaded but the program will not terminate until a minute later
2. run DockerImagePullerTest.works(), the image will be downloaded and the test will finish
