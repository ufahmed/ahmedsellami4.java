package container;

public class point {
	int abscisse;
	int ordonnée;
	char nom;
	
	point()
	{
		nom='o';
		abscisse=5;
		ordonnée=10;
	
	
	}
	
	public point(int abscisse,int ordonnée,char nom)
	{
		this.abscisse=abscisse;
		this.ordonnée=ordonnée;
		this.nom=nom;
				
	}
	point(point p)
	{
		abscisse=p.abscisse;
		ordonnée=p.ordonnée;
		nom=p.nom;
	}

	void afficher()
	{
		System.out.print(nom +"("+ abscisse + ordonnée +")");
	}

	void deplacer(int x,int y)
    {
		abscisse=abscisse+x;
	    ordonnée=ordonnée+y;

    }
	
	void reset()
	{
		abscisse=0;
		ordonnée=0;
	}
	
	public String toString()
	{
		return this.nom+"("+this.abscisse +","+this.ordonnée +")";
	}
	boolean coincide_V1(point p)
	{
		if(p.abscisse==this.abscisse)
		{
			if(p.ordonnée==this.ordonnée)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		else 
		{
			return false;
		}
	}
	
	static boolean coincide_v2(point p1,point p2)
	{
		return (p1.abscisse==p2.abscisse)&&(p1.ordonnée==p2.ordonnée);
	}

}
