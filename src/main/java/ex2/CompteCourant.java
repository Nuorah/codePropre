package ex2;

public class CompteCourant extends CompteBancaire {
	
	private double decouvert;
	
	/**
	 * Constructeur pour la classe CompteCourant
	 * @param solde
	 * @param decouvert
	 */	
	public CompteCourant(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}	
	
	@Override
	public void debiterMontant(double montant){		
		if (this.getSolde() - montant > this.decouvert){
			this.setSolde(this.getSolde() - montant);
		}		
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	
}
