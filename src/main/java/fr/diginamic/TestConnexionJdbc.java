package fr.diginamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TestConnexionJdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		
		ResourceBundle db = ResourceBundle.getBundle("database");

		Class.forName(db.getString("database.driver"));
		
        String url = db.getString("database.url");
        String user = db.getString("database.user");
        String pass =  db.getString("database.pass");
        
        try (
        		Connection co = DriverManager.getConnection(url, user, pass);
        		) {
        	System.out.println(co);
        } catch (SQLException e) {
        	System.out.println(e.getMessage());
        }
	}

}
