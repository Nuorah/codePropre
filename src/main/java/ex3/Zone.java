package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {
	
	private double masseNourriture;

	private List<Animal> animaux = new ArrayList<Animal>();
	
	public Zone(double masseNourriture){
		this.masseNourriture = masseNourriture;
	}	
	
	public double getMasseNourriture() {
		return masseNourriture;
	}
	
	public void setMasseNourriture(double masseNourriture) {
		this.masseNourriture = masseNourriture;
	}

	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal: animaux){
			System.out.println(animal.toString());
		}
	}
	
	public int compterAnimaux(){
		return animaux.size();
	}
	
	public double calculerKgsNourritureParJour(){
		return this.compterAnimaux()*this.getMasseNourriture();
	}
}
