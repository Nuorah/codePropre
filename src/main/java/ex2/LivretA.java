package ex2;

public class LivretA extends CompteBancaire {

	private double tauxRemuneration;
	
	/**
	 * Constructeur pour la classe LivretA
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}	

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	public void appliquerRemuAnnuelle(){
		this.ajouterMontant(this.getSolde()*tauxRemuneration/100);
	}

	@Override
	public void debiterMontant(double montant){		
		if (this.getSolde() - montant > 0){
			this.setSolde(this.getSolde() - montant);
		}	
	}
}
