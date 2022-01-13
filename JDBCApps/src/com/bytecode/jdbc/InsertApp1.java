package com.bytecode.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertApp1 {

	public static void main(String[] args) {
		Connection con=null;
		//Statement st=null;
		String INSERT_DATA=null;
		PreparedStatement ps=null;
		int result=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bytecode1","bytecode1");
			INSERT_DATA="insert into userlist values(?,?)";
			ps=con.prepareStatement(INSERT_DATA);
			ps.setString(1, "piyush");
			ps.setString(2, "payal");
			result=ps.executeUpdate();
			if(result==0) {
				System.out.println("Record not inserted");
			}
			else {
				System.out.println("Record inserted successfully");
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
