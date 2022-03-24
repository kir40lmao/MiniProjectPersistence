package dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {

	final static String connectionString = "jdbc:sqlserver://hildur.ucn.dk\\SQLExpress;databaseName=CSC-CSD-S212_10407565;user=CSC-CSD-S212_10407565;password=Password1!;encrypt=false;";
	private static DBConnection contextInstance;
	private Connection dbConnection;
	public DBConnection() throws Exception {
		try {
		dbConnection = DriverManager.getConnection(connectionString);
	} catch (SQLException e) {
		throw new Exception("Error connecting to atabase. Error was: '" + e.getMessage() + "'", e);
	}
		}
	public static DBConnection getInstance() throws Exception {
		
			if(contextInstance == null) {
				contextInstance = new DBConnection();
			}
		
		return contextInstance;
	}
	
	public Connection getConnection() {		return dbConnection;	}
}

