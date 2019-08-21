package com.business.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.business.ProductBusiness;
import com.business.impl.ProductBusinessImpl;
import com.pojo.Product;

class ProductBusinessImplTest {

	private static ProductBusiness business;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	business=new ProductBusinessImpl();
	
	}

	@Test
	void testAddProduct() {
		Product p=new Product(100, "dsf", 11, 1, "dsjf,sdh");
		assertEquals(p, business.addProduct(p));
		assertEquals(null, business.addProduct(p));
	}

}
