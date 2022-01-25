package jdbcCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelectEx {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test";
		String username="root";
		String password="root";
		
		String sqlSt = "SELECT *FROM employee";
		try {
			Connection cn = DriverManager.getConnection(url, username,password);
			Statement st = cn.createStatement();
			ResultSet rs=st.executeQuery(sqlSt);
			while(rs.next()) {
			 int empid = rs.getInt("eid");
			 String ename =rs.getString("ename");
			 int salary = rs.getInt("salary");
			 System.out.println("Emp Id:" + empid + ", Name:"+ ename+ "  Salary is : "+ salary);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
	}

}
