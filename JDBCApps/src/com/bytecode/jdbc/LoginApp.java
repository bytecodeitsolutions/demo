package com.bytecode.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginApp {

	public static void main(String[] args) {
		Connection con=null; 
		Statement st=null;
		String USER_LOGIN=null;
		String username=null;
		String password=null;
		Scanner scanner=null;
		ResultSet rs=null;
		int result=0;
		// load the driver software
		try {
			//getting input values from end user
			scanner=new Scanner(System.in);
			
			System.out.println("Enter username");
			username=scanner.next();
			//converting username value to required format
			username="'"+username+"'";
			
			System.out.println("Enter password");
			
			password=scanner.next();
			//converting password value to required format
			password="'"+password+"'";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// create the Connection object establish the connection to the database

			 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bytecode1", "bytecode1");
		    if(con!=null) {
			 st= con.createStatement();
		    }
		    USER_LOGIN="select count(*) from userlist where uname="+username+" and pass="+password;
		    //send the sql query to database
		    if(st!=null) {
		    	rs=st.executeQuery(USER_LOGIN);
		    }
		    if(rs!=null) {
		    	if(rs.next()!=false) {
		    		 result=rs.getInt(1);
		    	}//inner if
		    }//outer if
		    if(result==0) {
		    	System.out.println("Inavlid credentials");
		    }
		    else {
		    	System.out.println("Valid Credentials");
		    }
		     
		} //try
		//handling the known exception
		catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		//handling unknown exceptions
		catch (Exception e) {
			e.printStackTrace();
		}//catch
		finally {
			//closing connections in reverse order
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				scanner.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//finally

	}//main

}//class
