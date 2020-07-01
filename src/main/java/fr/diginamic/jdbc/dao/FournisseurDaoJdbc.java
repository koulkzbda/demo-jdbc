package fr.diginamic.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import fr.diginamic.exceptions.DaoException;
import fr.diginamic.jdbc.entites.Fournisseur;

public class FournisseurDaoJdbc implements FournisseurDao {

	@Override
	public List<Fournisseur> extraire() throws DaoException {
		List<Fournisseur> listFournisseurs = new ArrayList<>();
		ResultSet rs = requeter("SELECT * FROM FOURNISSEUR");
    	try {
			while ( rs.next() ) {
				listFournisseurs.add(new Fournisseur(rs.getInt("id"), rs.getString("nom")));
			}
		} catch (SQLException e) {// Ne sera jamais lancée btw
			throw new DaoException(e);
		}
    	
    	return listFournisseurs;
	}

	@Override
	public void insert(Fournisseur fournisseur) throws DaoException {
		requeter("INSERT INTO FOURNISSEUR(nom) VALUES('" + fournisseur.getNom() + "')");
	}

	@Override
	public int update(String nouveauNom, String ancienNom) throws DaoException {
		try {
			return requeter("UPDATE FOURNISSEUR SET nom='" + nouveauNom + "' WHERE nom='" + ancienNom + "'").getRow();
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public boolean delete(Fournisseur fournisseur) throws DaoException {
		try {
			return requeter("DELETE FROM FOURNISSEUR WHERE id='" + fournisseur.getId() + "'").getRow() > 0;
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}
	
	protected ResultSet requeter(String req) throws DaoException {
		ResourceBundle db = ResourceBundle.getBundle("database");

		try {
			Class.forName(db.getString("database.driver"));
		} catch ( ClassNotFoundException e ) {
        	throw new DaoException(e);
        }
		
		
        String url = db.getString("database.url");
        String user = db.getString("database.user");
        String pass =  db.getString("database.pass");
        
        try (
        		Connection co = DriverManager.getConnection(url, user, pass);
        		Statement st = co.createStatement();
        		ResultSet rs = st.executeQuery(req);
        		) {
        	return st.executeQuery(req);
        } catch ( SQLException e ) {
        	throw new DaoException(e);
        }
	}
	

}
