package com.longest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ODBC {

	public static void main(String[] args) throws Exception {

		
		System.setProperty("file.encoding" , "UTF-8");
		System.out.println(System.getProperty("java.version"));
		
		//String query = "insert into T2 values(1,'This should be an Em Dash:')";

		String query = "select * from T2";
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:testodbc1");
		Statement stmt = con.createStatement();
		
		/*
		PreparedStatement pstmt =
			    con.prepareStatement("INSERT INTO T2 VALUES (?,?)");
		System.out.println(pstmt.getFetchSize());
		System.out.println(pstmt.getMaxFieldSize());
		pstmt.setInt(1, 1);
		pstmt.setString(2, "12123");
		pstmt.execute();*/
		
		//int rs = stmt.executeUpdate(query);
		
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			int qty = rs.getInt("id");
			String desc = rs.getString("name");
			System.out.println(desc + "\t: " + qty);
		}
		
		
		con.close();
	}

}
