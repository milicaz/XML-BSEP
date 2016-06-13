package databaseReadWrite;

import ib.security.KeyStoreWriter;

import java.beans.Statement;
import java.security.KeyStoreException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class DatabaseWrite {
	String url = "jdbc:mysql://localhost:8080/BESP";
	String user = "sa";
	String password ="root";
	private PreparedStatement statement;
	private String sql;
	private java.sql.Statement stSetLimit;
	private String querySetLimit;
	private Connection conn;
	private String alias;
	private Date lastModified;

	public DatabaseWrite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DatabaseWrite(String url, String user, String password,
			Connection conn, String querySetLimit,
			java.sql.Statement stSetLimit, String sql,
			PreparedStatement statement) {
		super();
		this.url = url;
		this.user = user;
		this.password = password;
		this.conn = conn;
		this.querySetLimit = querySetLimit;
		this.stSetLimit = stSetLimit;
		this.sql = sql;
		this.statement = statement;
	}

	// String filePath = "D:/Photos/Tom.png";
	public PreparedStatement writeDatabase() throws KeyStoreException {
		
		KeyStoreWriter keyStoreWriter = new KeyStoreWriter();
		keyStoreWriter.testing(alias,lastModified,password);
		try {
			Connection conn = DriverManager.getConnection(url);

			String querySetLimit = "SET GLOBAL max_allowed_packet=104857600;"; // 10
																				// MB
			java.sql.Statement stSetLimit = conn.createStatement();
			stSetLimit.execute(querySetLimit);
            KeyStoreWriter.write(alias, null, null, null);
			//String sql = "LOAD DATA INFILE './data/marija.jks' INTO TABLE dbo.GenerateKeyPair;";
			String sql = "LOAD alias,lastModified INTO TABLE dbo.GenerateKeyPair;";

			PreparedStatement statement = conn.prepareStatement(sql);

		} catch (SQLException sqlex) {
		}
		return statement;

	}
}
