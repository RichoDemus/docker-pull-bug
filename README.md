# Docker-client pull bug

## What is this?
For some reason, docker pull seems to leave a non-daemon thread behind, prevent the jvm from shutting down  
But not when running it as a junit test

## reproduce
1. run DockerImagePuller.main(), the image will be downloaded but the program will not terminate
2. run DockerImagePullerTest.works(), the image will be downloaded and the test will finish