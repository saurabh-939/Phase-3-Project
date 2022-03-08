package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class UserAuthTest {

	Auth a=new Auth();
	
	@BeforeAll
	static void setUp()
	{
		System.out.println("Set Up");
	}
	
	@Test
	void test1() {
		assertEquals(true, a.authenticate("admin", "admin"));
		System.out.println("Equal");
	}
	
	@Test
	void test2() {
		assertEquals(false, a.authenticate("abc", "abc"));
		System.out.println("Not equal");
	}
	
	@AfterEach
	void tearDownauth()
	{
		a=null;
		System.out.println("Object deleted");
	}
	
	@AfterAll
	static void tearDownAll()
	{
		System.out.println("Closed");
	}

}
