package com.ridehours.vehice.dao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.ibatis.common.jdbc.ScriptRunner;
public class CreateSchema {
	public static void main(String[] a)
			throws Exception {
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.
				getConnection("jdbc:h2:~/test", "sa", "");
		// add application code here

		ScriptRunner sr = new ScriptRunner(conn, false, false);


		//String sql = "DROP TABLE state"; 
		Reader reader = new BufferedReader(
				new FileReader("SQL/DDL.sql"));

		// Exctute script
		sr.runScript(reader);

		System.out.println("Created table in given database...");
		DatabaseMetaData md = conn.getMetaData();
		ResultSet rs = md.getTables(null, null, "%", null);
		while (rs.next()) {
		  System.out.println(rs.getString(3));
		}
		conn.close();
		System.out.println("Connection Established");
	}
}