package insert_demo;

import java.util.List;

public interface ManufacturerDAO {
public Manufacturer registerManufacturer(Manufacturer manufacturer) throws BusinessException;
public Manufacturer getManufacturerById(int mid);
public Manufacturer updateManfacturerCity(int mid,String city);
public void deleteManufacturer(int mid);
public List<Manufacturer> getAllManufacturers() throws BusinessException;
}
