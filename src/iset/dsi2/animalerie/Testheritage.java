package iset.dsi2.animalerie;

public class Testheritage {
	public static void main(String[] args) {
		Animal[] tab=new Animal[3];
		Animal a=new Animal("noire",20);
		chats c1=new chats("beige",20,true);
		Chiens c2=new Chiens("blanc",20,"abscent");
		
		tab[0]=a;
		tab[1]=c1;
		tab[2]=c2;
		
		
		for(int i=0;i<tab.length;i++) {
			tab[i].decrisToi();
			tab[i].manger();
			tab[i].boire();
			tab[i].crier();
			if(tab.length==0) {
				System.out.println("L’espèce de cet animal est inconnue ");
			}
		}
		
		
	}
		
	 
}
