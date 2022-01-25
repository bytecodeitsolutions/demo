package com.bytecode.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class InsertApp2 {

	public static void main(String[] args) {
		Connection conn = null;
		String insertQuery = null, customerName = null, customerAddress = null;
		PreparedStatement ps = null;
		ResultSet resultSet = null;
		int result = 0;
		Scanner scanner = null;
		int id=0;
		int result1=0;

		try {
			// getting input values from end user
			scanner = new Scanner(System.in);
			
			System.out.println("Enter customer id");
			id = scanner.nextInt();
			System.out.println("Enter customer name");
			customerName = scanner.next();

			System.out.println("Enter customer address");
			customerAddress= scanner.next();
			// load the driver software
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Create the Connection object
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bytecode1", "bytecode1");
			// prepared sql query with place holder/ place resolver
			insertQuery = "insert into customer values(?,?,?)";
			
			//query = "select count(*)  from userlist where uname =? --and pass =?";
			// create PreparedStatement object with precompiled sql query
			if (conn != null) {
				ps = conn.prepareStatement(insertQuery);
			}
			// set the input values to query param (?)
			if (ps != null) {
				ps.setInt(1, id);
				ps.setString(2, customerName);
				ps.setString(3, customerAddress);
				result1 = ps.executeUpdate();
			}
			
			if (result1 == 0) {
				System.out.println("record not inserted successfully");
			} else {
				System.out.println("record inserted");
			}
			// handling known exceptions
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		// handling unknown exceptions
		catch (Exception e) {
			e.printStackTrace();
		}
		// close the connections in reverse manner
		finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (scanner != null) {
				try {
					scanner.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} // finally

	}// main

}// class
