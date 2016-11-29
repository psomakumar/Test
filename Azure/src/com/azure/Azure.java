package com.azure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Azure {

	public static void main(String[] args) {
		try{ 
		    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		    String connectionUrl = "jdbc:sqlserver://smartproddev.database.windows.net;" 
		                            + "database=smartproddev;" 
		                            + "user=smartproddev;" 
		                            + "password=S123mart"; 
		    Connection con = DriverManager.getConnection(connectionUrl); 		    
		    
		}catch(Exception e){ 
		        System.out.println("Exception :"+e.getMessage());
		} 

	}

}
