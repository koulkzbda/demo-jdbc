package fr.diginamic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class TestDelete {

	public static void main(String[] args) throws ClassNotFoundException {
		
		ResourceBundle db = ResourceBundle.getBundle("database");

		Class.forName(db.getString("database.driver"));
		
		
        String url = db.getString("database.url");
        String user = db.getString("database.user");
        String pass =  db.getString("database.pass");
        
        try (
        		Connection co = DriverManager.getConnection(url, user, pass);
        		Statement st1 = co.createStatement();
        		Statement st2 = co.createStatement();
        		ResultSet rs1 = st1.executeQuery("DELETE FROM FOURNISSEUR WHERE nom='La Maison des Peintures'");
        		ResultSet rs2 = st2.executeQuery("SELECT nom FROM FOURNISSEUR");
        		) {

        	while ( rs2.next() ) {
        		System.out.println(rs2.getString("nom"));//  Vérification du delete
        	}
        	
        } catch (SQLException e) {
        	System.out.println(e.getMessage());
        }

	}

}
