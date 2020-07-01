package fr.diginamic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ResourceBundle;

import fr.diginamic.exceptions.DaoException;
import fr.diginamic.jdbc.dao.FournisseurDao;
import fr.diginamic.jdbc.dao.FournisseurDaoJdbc;
import fr.diginamic.jdbc.entites.Fournisseur;

public class TestInsertion {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//  TP 3
//		ResourceBundle db = ResourceBundle.getBundle("database");
//
//		Class.forName(db.getString("database.driver"));
//		
//		
//        String url = db.getString("database.url");
//        String user = db.getString("database.user");
//        String pass =  db.getString("database.pass");
//        
//        try (
//        		Connection co = DriverManager.getConnection(url, user, pass);
//        		Statement st1 = co.createStatement();
//        		Statement st2 = co.createStatement();
//        		ResultSet rs1 = st1.executeQuery("INSERT INTO FOURNISSEUR(nom) VALUES('La Maison de la Peinture')");
//        		ResultSet rs2 = st2.executeQuery("SELECT nom FROM FOURNISSEUR WHERE nom = 'La Maison de la Peinture'");
//        		) {
//
//        	if ( rs2.next() ) {
//        		System.out.println(rs2.getString("nom"));//  Vérification de l'insertion
//        	}
//        	
//        } catch (SQLException e) {
//        	System.out.println(e.getMessage());
//        }

	// TP4
		
		FournisseurDao fd = new FournisseurDaoJdbc();
		
		try {
			
			fd.insert(new Fournisseur("La Maison de la Peinture"));
			
		} catch (DaoException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
