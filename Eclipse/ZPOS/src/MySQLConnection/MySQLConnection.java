package MySQLConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection
{
	// Variable Declarations
	private String user;
	private String url;
	private String password;
	private Connection connection;
	
	// Constructor
	public MySQLConnection(String user, String password)
	{
		this.url = "jdbc:mysql://localhost:3306/Inventory?autoReconnect=true&useSSL=false";
		this.user = user;
		this.password = password;
	}
	// Mutator Methods
	public String getUser()
	{
		return this.user;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public String getUrl()
	{
		return this.url;
	}
	
	public void setUser(String user)
	{
		this.user = user;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public void setAddress(String url)
	{
		this.url = url;
	}
	
	public Connection makeConnection(MySQLConnection conn)
	{
		try
		{
			Connection myConn = DriverManager.getConnection(conn.getUrl(), conn.getUser(), conn.getPassword());
			this.connection = myConn;
			return myConn;
		}
		
		catch (Exception exc)
		{
			System.out.println("Connection Failed!");
			exc.printStackTrace();
		}
		return null;
	}
	
	public Boolean isClosed() throws SQLException
	{
		return this.connection.isClosed();
	}

}
