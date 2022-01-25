package jdbcCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertEx {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test";
		String username="root";
		String password="root";
		String sqlSt = "INSERT INTO EMPLOYEE VALUES(104, 'ROBERT', 65000)";
		try {
			Connection cn= DriverManager.getConnection(url,username,password);
			Statement st= cn.createStatement();
			int i =st.executeUpdate(sqlSt);
			System.out.println("Successfully Inserted:"+i);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
