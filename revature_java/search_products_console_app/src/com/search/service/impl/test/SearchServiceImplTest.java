package com.search.service.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.search.exceptions.BusinessException;
import com.search.service.SearchService;
import com.search.service.impl.SearchServiceImpl;

class SearchServiceImplTest {

	static SearchService service;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		service=new SearchServiceImpl();
	}

	@Test
	final void testGetProductById() {
	try {
		//assertEquals(null, service.getProductById(1));
		assertNotNull(service.getProductById(9100));
	} catch (BusinessException e) {
		System.out.println(e);
	}		
	}

	@Test
	final void testGetProductsByManufacturedDate() {
		try {
			assertEquals(1, service.getProductsByManufacturedDate("09.10.2018").size());
			
		} catch (BusinessException e) {
			fail(e);
		}
	}

}
