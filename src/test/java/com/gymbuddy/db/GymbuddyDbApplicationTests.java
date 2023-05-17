package com.gymbuddy.db;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GymbuddyDbApplicationTests {

	private final ApplicationContext context;

	GymbuddyDbApplicationTests(ApplicationContext context) {
		this.context = context;
	}

	@Test
	void contextLoads() {
		assertEquals("gymbuddy-db", context.getId());
	}

}
