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
	
	public void insert(Object x) {
	
		
		Statement stm = null;
		
		if (x instanceof Usuario)
		{
			Usuario user = (Usuario)x;
			try{ 
				stm = getConnection().createStatement(); //me permite hacer el query de una manera que la DB pueda preprocesarlo
				stm.executeUpdate("insert into user (nombre, apellido, username, password) values ('"
				 + user.getNombre() + "','" + user.getApellido() + "','" + user.getUsername() + "','" + user.getPassword() + "');" );
		
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		else if (x instanceof Pelicula)
		{
			Pelicula peli = (Pelicula)x;
			
			/*try{ 
				stm = getConnection().createStatement(); //me permite hacer el query de una manera que la DB pueda preprocesarlo
				stm.executeUpdate("insert into user_movie(user_id, Movie_id) values ('"
				 + peli.getUser_id() + "','" + peli.getMovie_id() + "');" );
		
			} catch (SQLException e) {
				e.printStackTrace();
			}*/
			
			
			
			
			
		}
		
		
		
	


}
}