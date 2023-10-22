package iset.dsi2.animalerie;

public class Chiens extends Animal {
	private String race;
	Chiens()
	{
	}
	Chiens(String couleur,int poids, String race){
		super(couleur,poids);
		this.race=race;
	}
	

}
