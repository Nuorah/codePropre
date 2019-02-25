package ex3;

public class ZooApplication {

	public static void main(String[] args) {

		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal(new Herbivore("Gazelle"));
		zoo.addAnimal(new Herbivore("Zèbre"));
		zoo.addAnimal(new Carnivore("Lion"));
		zoo.addAnimal(new Carnivore("Panthère"));
		zoo.addAnimal(new Poisson("Requin blanc"));
		zoo.addAnimal(new Poisson("Truite dorÃ©e"));
		zoo.addAnimal(new Reptile("Boa constrictor"));
		zoo.addAnimal(new Reptile("Python"));
		
		zoo.afficherListeAnimaux();
	}
}
