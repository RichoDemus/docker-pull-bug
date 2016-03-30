package com.richodemus.test.docker.bug;

import org.junit.Test;

public class DockerImagePullerTest
{
	@Test(timeout = 20000L)
	public void works() throws Exception
	{
		new DockerImagePuller().pullImage("alpine:latest");

	}
}
