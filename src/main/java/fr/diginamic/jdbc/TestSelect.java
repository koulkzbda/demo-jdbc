package fr.diginamic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import fr.diginamic.jdbc.entites.Fournisseur;

public class TestSelect {

	public static void main(String[] args) throws ClassNotFoundException {
		
		ResourceBundle db = ResourceBundle.getBundle("database");

		Class.forName(db.getString("database.driver"));
		
		
        String url = db.getString("database.url");
        String user = db.getString("database.user");
        String pass =  db.getString("database.pass");
        
        try (
        		Connection co = DriverManager.getConnection(url, user, pass);
        		Statement st = co.createStatement();
        		ResultSet rs = st.executeQuery("SELECT * FROM FOURNISSEUR");
        		) {

        	List<Fournisseur> listFournisseurs = new ArrayList<>();
        	while ( rs.next() ) {
        		listFournisseurs.add(new Fournisseur(rs.getInt("id"), rs.getString("nom")));
        	}
        	
        	listFournisseurs.stream().forEach(System.out::println);
        	
        } catch (SQLException e) {
        	System.out.println(e.getMessage());
        }

	}

}
