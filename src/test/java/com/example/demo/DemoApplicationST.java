package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationST {

	@Test
	void my_simple_system_test() {
		System.out.println("This is a SYSTEM TEST!");
	}
}
