package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class UcanAccessRead {

	public void readTableAddress(Statement s) throws SQLException {
		String sql = "select * from Address";
		ResultSet rs = s.executeQuery(sql);
		// Display table details
		tableDetails(rs);
	/*	System.out.println("===Address===");
		System.out.println();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4)
					+ " " + rs.getDouble(5) + " " + rs.getInt(6) + " " + rs.getInt(7) + " " + rs.getInt(8) + " "
					+ rs.getString(9) + " " + rs.getDouble(10) + " " + rs.getDouble(11) + " " + rs.getBoolean(12) + " "
					+ rs.getBoolean(13) + " " + rs.getDouble(14) + " " + rs.getString(15));
		} */
	}

	public void readTableCloseBl(Statement s) throws SQLException {
		String sql = "select * from CloseBl";
		ResultSet rs = s.executeQuery(sql);
		// Display table details
		tableDetails(rs);
	/*	System.out.println("===CloseBl===");
		System.out.println();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4)
					+ " " + rs.getDouble(5) + " " + rs.getInt(6) + " " + rs.getInt(7) + " " + rs.getInt(8) + " "
					+ rs.getString(9) + " " + rs.getDouble(10) + " " + rs.getDouble(11) + " " + rs.getBoolean(12) + " "
					+ rs.getBoolean(13) + " " + rs.getDouble(14) + " " + rs.getString(15));
		} */
	}
	
	public void readTableCompany(Statement s) throws SQLException {
		String sql = "select * from Company";
		ResultSet rs = s.executeQuery(sql);
		// Display table details
		tableDetails(rs);
	/*	System.out.println("===Company===");
		System.out.println();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4)
					+ " " + rs.getDouble(5) + " " + rs.getInt(6) + " " + rs.getInt(7) + " " + rs.getInt(8) + " "
					+ rs.getString(9) + " " + rs.getDouble(10) + " " + rs.getDouble(11) + " " + rs.getBoolean(12) + " "
					+ rs.getBoolean(13) + " " + rs.getDouble(14) + " " + rs.getString(15));
		} */
	}
	
	public void readTableDayBook(Statement s) throws SQLException {
		String sql = "select * from DayBook";
		ResultSet rs = s.executeQuery(sql);
		// Display table details
		tableDetails(rs);
	/*	System.out.println("===DayBook===");
		System.out.println();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4)
					+ " " + rs.getDouble(5) + " " + rs.getInt(6) + " " + rs.getInt(7) + " " + rs.getInt(8) + " "
					+ rs.getString(9) + " " + rs.getDouble(10) + " " + rs.getDouble(11) + " " + rs.getBoolean(12) + " "
					+ rs.getBoolean(13) + " " + rs.getDouble(14) + " " + rs.getString(15));
		} */
	}
	
	public void readTableSchedule(Statement s) throws SQLException {
		String sql = "select * from Schedule";
		ResultSet rs = s.executeQuery(sql);
		// Display table details
		tableDetails(rs);
	/*	System.out.println("===Schedule===");
		System.out.println();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4)
					+ " " + rs.getDouble(5) + " " + rs.getInt(6) + " " + rs.getInt(7) + " " + rs.getInt(8) + " "
					+ rs.getString(9) + " " + rs.getDouble(10) + " " + rs.getDouble(11) + " " + rs.getBoolean(12) + " "
					+ rs.getBoolean(13) + " " + rs.getDouble(14) + " " + rs.getString(15));
		} */
	}
	
	public static void getTableTypes(DatabaseMetaData metaData) throws SQLException {
		ResultSet tableTypes = metaData.getTableTypes();
		while (tableTypes.next()) {
			System.out.println(tableTypes.getString(1));
		}
	}

	public void databaseDetails(Connection c) throws SQLException {
		DatabaseMetaData metaData = c.getMetaData();
		// getTableTypes(metaData);
		String[] types = { "GLOBAL TEMPORARY", "SYSTEM TABLE", "TABLE", "VIEW" };
		ResultSet tables = metaData.getTables(null, null, "%", types);
		System.out.println("---------Table List------");
		while (tables.next()) {
			System.out.println("Table name: " + tables.getString("TABLE_NAME"));
		}
		System.out.println("------------------------");
	}

	public static void tableDetails(ResultSet rs) throws SQLException {
		ResultSetMetaData rsmdata = rs.getMetaData();
		System.out.println("Table Name: " + rsmdata.getTableName(1));

		int count = rsmdata.getColumnCount();
		System.out.println("---Column List---");
		for (int i = 1; i <= count; i++) {
			System.out.println(
					"Column " + i + ": " + rsmdata.getColumnLabel(i) + " \"" + rsmdata.getColumnTypeName(i) + "\"");
		}
		System.out.println("------------------");

	}

	public void readTableAccHead(Statement s) throws SQLException {
		String sql = "select * from AccHead";
		ResultSet rs = s.executeQuery(sql);
		// Display table details
		tableDetails(rs);
		System.out.println("===AccHead===");
		System.out.println();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4)
					+ " " + rs.getDouble(5) + " " + rs.getInt(6) + " " + rs.getInt(7) + " " + rs.getInt(8) + " "
					+ rs.getString(9) + " " + rs.getDouble(10) + " " + rs.getDouble(11) + " " + rs.getBoolean(12) + " "
					+ rs.getBoolean(13) + " " + rs.getDouble(14) + " " + rs.getString(15));
		}
	}

	public static void main(String[] args) {
		UcanAccessRead access = new UcanAccessRead();

		Connection conn = AccessConnector.getConnection();
		try {
			// Display database details
			access.databaseDetails(conn);

			Statement s = conn.createStatement();
			// Read table details
		//	access.readTableAccHead(s);
			access.readTableAddress(s);
			access.readTableCloseBl(s);
			access.readTableCompany(s);
			access.readTableDayBook(s);
			access.readTableSchedule(s);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}