package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test1 {
public static void main(String[] args) {
	 try
	 {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "6312");
			
 Statement st  = con.createStatement();
 st.executeUpdate("create table emp(eno number, ename varchar(20), esal number)");
 st.executeUpdate("INSERT INTO emp (eno, ename, esal) VALUES(1,'niki',60000)");
 st.executeUpdate("INSERT INTO emp (eno, ename, esal) VALUES(2,'sam',80000)");

 System.out.println("data inserted succesfully");
 
 con.close();
	 }
	 catch(Exception e)
	 {
		 System.out.println("Error:" + e.getMessage());
 
	 }


	
}
}
