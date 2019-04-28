package org.ismek.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlCon {

	public static Connection baglantiOlustur() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/market?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", 
					"root", 
					"1234");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
