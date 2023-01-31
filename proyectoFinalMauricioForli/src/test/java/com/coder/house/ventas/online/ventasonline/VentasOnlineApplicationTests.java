package com.coder.house.ventas.online.ventasonline;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = {
		"classpath*:spring/applicationContext.xml",
		"classpath*:spring/applicationContext-jpa.xml",
		"classpath*:spring/applicationContext-security.xml" })

@SpringBootTest (classes = VentasOnlineApplication.class)
class VentasOnlineApplicationTests {

	@Test
	void contextLoads() {
	}

}
