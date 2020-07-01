package fr.diginamic.jdbc;

import fr.diginamic.exceptions.DaoException;
import fr.diginamic.jdbc.dao.FournisseurDao;
import fr.diginamic.jdbc.dao.FournisseurDaoJdbc;
import fr.diginamic.jdbc.entites.Fournisseur;

public class TestDelete {

	public static void main(String[] args) throws ClassNotFoundException {
		
	// TP3
		
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
//        		ResultSet rs1 = st1.executeQuery("DELETE FROM FOURNISSEUR WHERE nom='La Maison des Peintures'");
//        		ResultSet rs2 = st2.executeQuery("SELECT nom FROM FOURNISSEUR");
//        		) {
//
//        	while ( rs2.next() ) {
//        		System.out.println(rs2.getString("nom"));//  Vérification du delete
//        	}
//        	
//        } catch (SQLException e) {
//        	System.out.println(e.getMessage());
//        }
		
	// TP4
		
		FournisseurDao fd = new FournisseurDaoJdbc();
		
		try {
			System.out.println(fd.delete(new Fournisseur(8, "La Maison des Peintures")));
		} catch (DaoException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
