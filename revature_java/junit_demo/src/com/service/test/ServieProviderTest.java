package com.service.test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.service.ServiceProvider;

public class ServieProviderTest {

	private static ServiceProvider service;

	@BeforeAll
	public static void instantiateService() {
		System.out.println("First");
		service = new ServiceProvider();
	}

	@Test
	public void testIsPrime() {
		System.out.println("TestPrime");
		/* fail("Not yet implemented"); */
		assertTrue(service.isPrime(2));
		assertFalse(service.isPrime(9));
	}

	@Test
	public void testZero() {
		System.out.println("Test zero");
		assertEquals(false, service.isPrime(0));
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("Last");
		service = null;
	}

}