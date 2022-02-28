package com.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	
	Connection conn=null;
	
	public Connection connection()
	{
		
		String databaseUrl="jdbc:mysql://localhost:3306/bankapplication";
		String userName="root";
		String userPassword="mysql";
		
			
				try {
					conn=DriverManager.getConnection(databaseUrl, userName, userPassword);
					
				} 
				
				catch (SQLException e) {
					
					System.out.println("Internal Server Error!!");
				}
				
				return conn;
}
}
