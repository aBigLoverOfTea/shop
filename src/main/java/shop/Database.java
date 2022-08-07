// Now this class don't work because i didn't created database, so just pretend that this file is a myth

package shop;

import java.sql.*;

public class Database {
	public static final String DB_URL = "jdbc:h2:/../../../../db";
	public static final String DB_Driver = "org.h2.Driver";
	private static Connection connection = null;

	static public void connect() {
		try {
			Class.forName(DB_Driver);
			connection = DriverManager.getConnection(DB_URL);
			System.out.println("Connected.");
		} catch (ClassNotFoundException e) {
			System.out.println("Error: cannot find DB driver. Details:");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error: connection failed. Details: ");
			e.printStackTrace();
		}

	}

	static public void disconnect() {
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error: disconnection failed. Details: ");
			e.printStackTrace();
		}
	}
}