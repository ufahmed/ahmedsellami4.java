package container;

public class Pointcol extends point {
	private String couleur;
	
	Pointcol(){
		couleur="noire";
	}
	Pointcol(int abscisse ,int ordonnée,char nom,String couleur ){
		super(abscisse,ordonnée,nom);
		this.couleur=couleur;
		
	}
	
	public void Setcolor(String color) {
		this.couleur=color;
		
	}
	public String getcolor() {
		return this.couleur;
	}
	
	public String toString() {
        return super.toString()+"with color " + couleur;
    }
	
	

}
