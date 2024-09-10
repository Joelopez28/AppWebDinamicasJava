package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
    private static Connection connection = null;
    
    private Conexion() {
    
    String url = "jdbc:mysql://localhost:3306/sprintgrupo2";
    String user = "root";
    String driver = "com.mysql.jdbc.Driver";
    String password = "Rojas.1999";

    try {
    	Class.forName(driver);
    	try {
    		connection=DriverManager.getConnection(url, user, password);
    	} catch(SQLException se) {
    		se.printStackTrace();
    	}
    } catch (Exception se) {
    	se.printStackTrace();
    }
   }

	public static Connection getConnection() {
		if (connection == null) {
			   new Conexion();
			   System.out.println("Se creo la conexion"); // DEBUG
			   System.out.println("Metodo getConnection: " + connection);


			   return connection;
			  } else {
			   System.out.println("Retorno conexion..."); // DEBUG
			   return connection;
			  }
		
	}

}