package conexionBD;

import java.sql.*;

public class BaseDatos {
	
	private static Connection con;
	private static Statement statement;
	private static ResultSet result;
	
	private static final String url = "jdbc:mysql//localhost";
	private static final String username = "root";
	private static final String password = "ja";
	
	BaseDatos(){
		
		con = null;
		statement = null;
		result = null;
	}
	
	public static Connection getConnection(){
		
		if(con != null ) {return con;}
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			statement = con.createStatement();
			result = statement.executeQuery("");
			
		}catch(SQLException | ClassNotFoundException e){
			
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static int verifyUser(String user, String password){
		
		return 0;
	}

}
