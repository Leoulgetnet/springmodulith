package com.leoulgetnet.springmodulith;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class SpringmodulithApplicationTests {

	@Test
	void contextLoads() {
	}  @Test
	void verifyModularity() {
		ApplicationModules modules = ApplicationModules.of(SpringmodulithApplication.class);
		modules.verify(); // Fails if there are dependency violations!
	}


}
