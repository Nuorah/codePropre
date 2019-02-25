package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	private double solde;

	/**
	 * Constructeur pour la classe abstraite CompteBancaire
	 * @param solde
	 */
	public CompteBancaire(double solde) {
		this.solde = solde;
	}

	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}

	/** D�bite un montant au solde si autoris�
	 * @param montant
	 */
	public abstract void debiterMontant(double montant);
		
	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}


}
