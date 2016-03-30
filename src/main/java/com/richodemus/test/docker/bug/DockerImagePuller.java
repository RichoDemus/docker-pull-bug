package com.richodemus.test.docker.bug;


import com.spotify.docker.client.DefaultDockerClient;
import com.spotify.docker.client.DockerClient;

class DockerImagePuller
{
	void pullImage(final String image) throws Exception
	{
		final DockerClient docker = DefaultDockerClient.fromEnv().build();

		// Pull an image
		System.out.println("pulling");
		docker.pull(image);
		System.out.println("##done!");
		docker.close();
		System.out.println("closed");
	}

	public static void main(String[] args) throws Exception
	{
		new DockerImagePuller().pullImage("alpine:latest");
	}
}
