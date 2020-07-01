package fr.diginamic.jdbc.dao;

import java.util.List;

import fr.diginamic.exceptions.DaoException;
import fr.diginamic.jdbc.entites.Fournisseur;

public interface FournisseurDao {

	List<Fournisseur> extraire() throws DaoException;
	void insert(Fournisseur fournisseur) throws DaoException;
	int update(String nouveauNom, String ancienNom) throws DaoException;
	boolean delete(Fournisseur fournisseur) throws DaoException;
	
}
