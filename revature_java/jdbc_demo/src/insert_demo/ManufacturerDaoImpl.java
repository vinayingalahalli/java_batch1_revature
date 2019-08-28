package insert_demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dbutil.OracleConnection;

public class ManufacturerDaoImpl implements ManufacturerDAO {

	@Override
	public Manufacturer registerManufacturer(Manufacturer manufacturer) throws BusinessException {
		try(Connection connection=OracleConnection.getConnection()){
			String sql="insert into manufacturers(mid,name,city,contact) values(?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, manufacturer.getMid());
			preparedStatement.setString(2, manufacturer.getName());
			preparedStatement.setString(3, manufacturer.getCity());
			preparedStatement.setLong(4, manufacturer.getContact());
			int c=preparedStatement.executeUpdate();
			if(c==0) {
			throw new BusinessException("Failure in Registration.. Please Retry");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured. Kindly contact SYSADMIN");
		}
		
		
		
		return manufacturer;
	}

	@Override
	public Manufacturer getManufacturerById(int mid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Manufacturer updateManfacturerCity(int mid, String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteManufacturer(int mid) {
		// TODO Auto-generated method stub
		
	}

}
