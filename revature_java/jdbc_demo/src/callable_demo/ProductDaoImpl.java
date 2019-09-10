package callable_demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.dbutil.OracleConnection;

import insert_demo.BusinessException;

public class ProductDaoImpl implements ProductDAO {

	@Override
	public Product registerProduct(Product product) throws BusinessException {
		try(Connection connection=OracleConnection.getConnection()){
			String sql="{call registerproducts(?,?,?,?,?,?)}";
			CallableStatement callableStatement=connection.prepareCall(sql);
			callableStatement.setString(2, product.getName());
			callableStatement.setDouble(3, product.getPrice());
			callableStatement.setFloat(4, product.getRatings());
			callableStatement.setInt(5, product.getManufacturer().getMid());
			callableStatement.setDate(6, new java.sql.Date(product.getManufactured_date().getTime()));
			callableStatement.registerOutParameter(1, java.sql.Types.NUMERIC);
			
			callableStatement.execute();
			product.setId(callableStatement.getInt(1));
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured");
		}
		
		return product;
	}

}