package com.bytecode.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateInsertionApp {

	public static void main(String[] args) throws ParseException {
		// defining all the required variables
		Connection con = null;
		PreparedStatement ps = null;
		String INSERT_DATE_QUERY = null;
		Scanner scanner = null;
		String name, address, sdop, sdor, sdom;
		java.util.Date udop, udor;
		int id = 0;
		long ms = 0;
		long ms1 = 0;
		java.sql.Date sqldop, sqldor, sqldom;
		SimpleDateFormat simpleDateFormat, simpleDateFormat2;
		int result = 0;
		// step-1 load the driver class
		
			// getting input values from end user
			scanner = new Scanner(System.in);
			System.out.println("Enter customer id");
			id = scanner.nextInt();

			System.out.println("Enter customer name");
			name = scanner.next();

			System.out.println("Enter customer address");
			address = scanner.next();

			System.out.println("Enter date of purchase dd-mon-yy");
			sdop = scanner.next();

			System.out.println("Enter date of return mm-dd-yy");
			sdor = scanner.next();

			System.out.println("Enter date of marriage yyyy-mm-dd");
			sdom = scanner.next();
			// converting string date of purchase sdop to java.util.Date

			simpleDateFormat = new SimpleDateFormat("DD-MM-YY");
			udop = simpleDateFormat.parse(sdop);

			// converting java.util.Date udop to java.sql.Date sqldop

			ms = udop.getTime();

			sqldop = new java.sql.Date(ms);

			// converting string date of return sdor to java.util.Date

			simpleDateFormat2 = new SimpleDateFormat("MM-DD-YY");
			udor = simpleDateFormat2.parse(sdor);

			// converting java.util.Date udop to java.sql.Date sqldop

			ms1 = udor.getTime();

			sqldor = new java.sql.Date(ms1);

			// converting string date of marriage sdom (mysql db format==java.sql.Date
			// formaat)
			sqldom = java.sql.Date.valueOf(sdom);
			
			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// step-2
			// create the Connection object

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bytecode1", "bytecode1");
			INSERT_DATE_QUERY = "insert into customer values(?,?,?,?,?,?)";
			// step-3 : create the PreparedStatement object
			if (con != null) {
				ps = con.prepareStatement(INSERT_DATE_QUERY);
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, address);
				ps.setDate(4, sqldop);
				ps.setDate(5, sqldor);
				ps.setDate(6, sqldom);
				result = ps.executeUpdate();
			}
			if (result == 0) {
				System.out.println("record not inserted");
			} else {
				System.out.println("record inserted");
			}

			// handling known exception
		} catch (ClassNotFoundException | SQLException cnfe) {
			cnfe.printStackTrace();
		}
		// handling unknown exception
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close the connections in reverse order
			try {
				ps.close();
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

		} // finally

	}// main

}// class
