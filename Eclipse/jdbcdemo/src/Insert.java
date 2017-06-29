import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;


public class Insert
{

	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306/demo?autoReconnect=true&useSSL=false";
		String user = "Zeuxx";
		String password = "(Purple5!)";
		
		try
		{
			//1. Get Connection to database
			Connection myConn = makeConnection(url, user, password);
			
			// 2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			// 3. Execute SQL query
			String sql = "insert into employees "
					+ " (last_name, first_name, email)"
					+ " values ('Brown', 'David', 'david.brown@foo.com')";
			
			myStmt.executeUpdate(sql);
			
			System.out.println("Insert Complete.");
		}
		
		catch (Exception exc)
		{
			exc.printStackTrace();
		}
	}
	
	public static Connection makeConnection(String url, String user, String password) throws SQLException
	{
		Connection myConn = DriverManager.getConnection(url, user, password);
		return myConn;
	}
	
	

}
