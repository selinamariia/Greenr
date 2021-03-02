package com.group41.Greenr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.group41.Greenr.web.ProfileController;

@SpringBootTest
class GreenrApplicationTests {

	private String email = "example@example.com";
	@Test
	void contextLoads() {
	}
	
	@Test
	void canSendEmail()
	{
		assertEquals("Success", ProfileController.sendEmail(email));
	}

}
