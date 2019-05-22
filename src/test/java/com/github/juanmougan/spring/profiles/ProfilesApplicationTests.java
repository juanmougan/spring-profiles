package com.github.juanmougan.spring.profiles;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(profiles = "test")
public class ProfilesApplicationTests {

	@Autowired
	private Bean bean;

	@Test
	public void testCorrectBean() {
		assertEquals("I'm just a test bean :(", bean.sayMyName());
	}

}
