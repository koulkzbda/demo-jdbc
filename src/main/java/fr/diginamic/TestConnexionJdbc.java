package fr.diginamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TestConnexionJdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		
		ResourceBundle db = ResourceBundle.getBundle("database");

		Class.forName(db.getString("database.driver"));
		
		// TP1
		
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
        
        //  TP2
        
        Class.forName(db.getString("db.driver"));
        
        String url2 = db.getString("db.MYSQL_ADDON_URI");
        String user2 = db.getString("db.MYSQL_ADDON_USER");
        String pass2 =  db.getString("db.MYSQL_ADDON_PASSWORD");
        
        try (
        		Connection co2 = DriverManager.getConnection(url2, user2, pass2);
        		) {
        	System.out.println(co2);
        } catch (SQLException e) {
        	System.out.println(e.getMessage());
        }
        
	}

}
