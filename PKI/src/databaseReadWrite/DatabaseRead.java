package databaseReadWrite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseRead {


	String url = "jdbc:mysql://localhost:8080/BESP";
    String user = "sa";
    String password = "root";
	private PreparedStatement statement;
	private String sql;
	private java.sql.Statement stSetLimit;
	private String querySetLimit;
	private Connection conn;
	public DatabaseRead(String url, String user, String password,
			PreparedStatement statement, String sql, Statement stSetLimit,
			String querySetLimit, Connection conn) {
		super();
		this.url = url;
		this.user = user;
		this.password = password;
		this.statement = statement;
		this.sql = sql;
		this.stSetLimit = stSetLimit;
		this.querySetLimit = querySetLimit;
		this.conn = conn;
	}
	public DatabaseRead() {
		// TODO Auto-generated constructor stub
	}
	public PreparedStatement readDatabase() {
		try {
			Connection conn = DriverManager.getConnection(url, user, password);

			String querySetLimit = "SET GLOBAL max_allowed_packet=104857600;"; // 10
																				// MB
			java.sql.Statement stSetLimit = conn.createStatement();
			stSetLimit.execute(querySetLimit);

			String sql = "INSERT DATA FROM FILE './data/marija.jks' INTO TABLE dbo.GenerateKeyPair;";
			PreparedStatement statement = conn.prepareStatement(sql);

		} catch (SQLException sqlex) {
		}
		return statement;

	}
}
