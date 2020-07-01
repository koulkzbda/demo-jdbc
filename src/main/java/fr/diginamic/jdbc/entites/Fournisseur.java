package fr.diginamic.jdbc.entites;

/** Représente un fournisseur
 * @author Baptiste
 *
 */
public class Fournisseur {
	
	/** id */
	protected int id = 0;
	
	/** nom */
	protected String nom;

	/** Constructeur
	 * @param id
	 * @param nom
	 */
	public Fournisseur(int id, String nom) {
		this.id = id;
		this.nom = nom;
	}
	
	/** Constructeur
	 * @param nom
	 */
	public Fournisseur(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "[id = " + id + ", nom = " + nom + "]";
	}

	/** Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
