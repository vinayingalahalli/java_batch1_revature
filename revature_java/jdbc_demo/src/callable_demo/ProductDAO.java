package callable_demo;

import insert_demo.BusinessException;

public interface ProductDAO {
public Product registerProduct(Product product) throws BusinessException;
}
