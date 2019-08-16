package com.business.impl;

import java.util.HashMap;
import java.util.Map;

import com.business.ProductBusiness;
import com.pojo.Product;

public class ProductBusinessImpl implements ProductBusiness{

	private Map<Integer, Product> productMap=new HashMap<>();
}
