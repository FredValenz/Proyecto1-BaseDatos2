package conexionBD;

import java.sql.*;

public class BaseDatos {
	
	private static Connection con;
	private static Statement statement;
	private static ResultSet result;
	
	private static final String url = "jdbc:mysql://localhost:3306/recomendaciondb?autoReconnect=true&useSSL=false";
	private static final String username = "root";
	private static final String password = "ja";
	
	public BaseDatos(){
		
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
			//result = statement.executeQuery("");
			
		}catch(SQLException | ClassNotFoundException e){
			
			e.printStackTrace();
		}
		
		return con;
	}
	
	
	//Logica Login
	
	
	public static int verifyuser(String user,String password){
		int result = 0;
		Statement stm = null;
		
		try{
			stm = getConnection().createStatement();
			ResultSet rs = stm.executeQuery("Select * from user");
			while(rs.next()){
				if(rs.getString("username").equals(user)&& rs.getString("password").equals(password)){
					result = 1;
				}
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return result;
	}


}
