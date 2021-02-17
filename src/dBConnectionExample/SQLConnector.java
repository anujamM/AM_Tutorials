package dBConnectionExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLConnector {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String dbURL = "jdbc:mysql://localhost:3306/testschema?autoReconnect=true&useSSL=false";
		String username = "root";
		String password = "mysql _run!2019";

		String query = "select * from testtable";

		Class.forName("com.mysql.cj.jdbc.Driver"); // Load Driver
		System.out.println("Driver Loaded!");

		Connection con = DriverManager.getConnection(dbURL, username, password); // Creates connection to dB

		Statement stmnt = con.createStatement(); // Create statement Object or Prep Statement

		ResultSet rs = stmnt.executeQuery(query); // Execute the SQL Query. Store result in ResultSet
		while (rs.next()) {
			String myFirstName = rs.getString(2);
			String myLastName = rs.getString(3);
			System.out.println("My name is: " + myFirstName + " " + myLastName);
		}
		
		String count = "select count(*) from testtable";
		Statement stmnt2 = con.prepareStatement(count);
		ResultSet rsCount = stmnt2.executeQuery(count);
		rsCount.next();
		int rowCount = rsCount.getInt(1);
		System.out.println("Number of rows are: " + rowCount);
		
		String query2 = "select id, email from testtable";
		Statement stmnt3 = con.prepareStatement(query2);
		ResultSet rs2 = stmnt3.executeQuery(query2);
		
		while(rs2.next()) {
			String idAndEmail = rs2.getString("id") + " " + rs2.getString("email");
			System.out.println(idAndEmail);	
		}		
		rs.close();
		stmnt.close();
		con.close();

	}

}
