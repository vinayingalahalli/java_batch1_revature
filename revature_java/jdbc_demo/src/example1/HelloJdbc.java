package example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJdbc {

	public static void main(String[] args) {
		
		Connection connection=null;
		try {
			//Step 1
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver Loaded");
			//Step 2
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="revature";
			String password="revature";
			connection=DriverManager.getConnection(url, user, password);
			System.out.println("Ping succeded");
			//Step 3
			Statement statement=connection.createStatement();
			String sql="select id,name,ratings,price,manufactured_date from products order by ratings desc";
			//Step 4
			ResultSet resultSet=statement.executeQuery(sql);
			System.out.println("Query Executed");
			//Step 5
			while(resultSet.next()) {
				System.out.print("Id = "+resultSet.getInt("id")+" Name = "+resultSet.getString("name"));
				System.out.print(" Rating = "+resultSet.getFloat("ratings"));
				System.out.print(" Price = "+resultSet.getDouble("price"));
				System.out.println(" Manufactured Date "+resultSet.getDate("manufactured_date"));
			}
			System.out.println("Results Processed");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}finally {
			//Step6
			try {
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}

}
