package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccessConnector {

	private Connection conn;

	public AccessConnector() {
		try {
			conn = DriverManager.getConnection("jdbc:ucanaccess://C:/Trident/Demo/CrDr/Data/18-19.001/18-19.001", "",
					"shuttle");
		} catch (SQLException e) {
			System.out.println("SQL Error in mdb file");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return new AccessConnector().conn;
	}

}
