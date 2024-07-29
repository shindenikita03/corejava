package com.wipro.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test3 {
	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver class loaded");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhhost:1521:xe","System","6312");
		System.out.println("i got the connection");
		
		Statement st  = con.createStatement();
		st.addBatch("INSERT INTO employee VALUES(103,'rayon','Engg' 10000)");
		st.addBatch("UPDATE employee SET salary=10000 WHERE emp id = 103");
		st.addBatch("delete from employee where empid =104");

		
		
        int x[] = st.executeBatch();
		
		System.out.println(x[0] + "row(s) inserted");
		System.out.println(x[1] + "row(s) updated");
		System.out.println(x[2] + "row(s) deleted");
		
		
		con.close();
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}


