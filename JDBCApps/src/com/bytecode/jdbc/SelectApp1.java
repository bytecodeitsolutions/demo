/*
 * 1. In the place of implicit import we should use explicit import.
 * 2. Define all the local variables at the top of methods and global variables at the top of class.
 * 3. take all variable name,methodName , class name or interface name with some meaning.
 * 4. define meaning comments for every java statement.
 * 5. use soft coding in the place hard coding
 * */
package com.bytecode.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectApp1 {

	public static void main(String[] args) {
		Connection connection = null;
		
		Statement statement = null;
		String SELECT_EMP_RECORD_ENO = null;
		ResultSet resultSet=null;
		int result = 0,eno=0;
		Scanner scanner = null;
		// creating scanner class object to take input value from user

		// step-1 load the driver class==manage translator
		try {
			scanner = new Scanner(System.in);
			// getting emp number from end user to delete the record
			System.out.println("Enter employee Number to ftech the record");
			
			eno = scanner.nextInt();
              
			//load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Step-2:establish the connection b/w java app and database s/w
			// Creating Connection object
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bytecode1", "bytecode1");

			// step-3: create Statement object//vehicle
			statement = connection.createStatement();

			// step-4 Prepare sql query ==requirement
			//DELETE_EMP_RECORD_BYID = "delete from employee where ename=" + name;
			//SELECT_EMP_RECORD_ENO="select empno,ename,job,sal from emp";
			SELECT_EMP_RECORD_ENO="select empno,ename,job,sal from emp where empno="+eno;
           // System.out.println(DELETE_EMP_RECORD_BYID);
			// step-5 send the sql query to database software and execute it
			//result = statement.executeUpdate(DELETE_EMP_RECORD_BYID);
            resultSet=statement.executeQuery(SELECT_EMP_RECORD_ENO);
			/*if (result == 0) {
				System.out.println("Record not deleted for emp number :: " + name);
			} else {
				System.out.println("Record deleted for employee number :: " + name);
			}*/
            System.out.println(resultSet.getCursorName());
           while(resultSet.next()!=false) {
            	System.out.println("Empno:: "+resultSet.getInt(1)+" Ename:: "+resultSet.getString(2)+
            			" Job :: "+resultSet.getString(3)+" salary :: "+resultSet.getInt(4));
            }
            
            
		}
		// handling known exceptions[exception handling]
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// close all the connection objects in the reverse order
		finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				scanner.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // finally
	}// main

}// class
