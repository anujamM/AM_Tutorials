package dBConnectionExample;
import java.sql.*;

public class SQL_WithoutDSN {

	public static void main(String[] args) {
		try {
			String database = "testschema.testtable";
			
			   String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)}; DBQ=" + database + "; DriverID=22; READONLY=true"; 
					
	                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
	                    Connection c=DriverManager.getConnection(url);  
	                    Statement st=c.createStatement();  
	                    ResultSet rs=st.executeQuery("select * from testtables");  
	                     
	                    while(rs.next()){  
	                     System.out.println(rs.getString(1));  
	                    }  
	                   
	                 }catch(Exception ee){System.out.println(ee);}  
	                   
	                 }}  