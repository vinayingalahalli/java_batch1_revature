package com.search.dao;

import java.util.List;

import com.search.exceptions.BusinessException;
import com.search.model.Manufacturer;

public interface ManufacturerDAO {

public List<Manufacturer> getAllManufacturers() throws BusinessException;
}
