package pacman;

public class Casella {

	public static final int tipusBuida = 1;
	public static final int tipusMur = 2;
	public static final int tipusPunt = 3;
	public static final int tipusPuntEspecial = 4;
	
	public static final int hola = 3;
	
	private int tipus;
	
	public Casella(int tipus){
		this.tipus=tipus;
	}
	
	public boolean buida(){
		return tipus==tipusBuida;
	}
	
	public boolean mur(){
		return tipus==tipusMur;
	}
	
	public boolean punt(){
		return tipus==tipusPunt;
	}
	
	public boolean puntEspecial(){
		return tipus==tipusPuntEspecial;
	}

	public void obtenirTipus(){
		
		do{
			switch(tipus){
				case tipusBuida:
					buida();
					break;
				case tipusMur:
					break;
				case tipusPunt:
					break;
				case tipusPuntEspecial:
					break;
			}
		}while(tipus<0||tipus>4);
		
	}
	public void repCasella(){
		
	}
	public void fixar(){
		
	}
	public void canviar(){
		
	}
	
	
	
/*public String toString(){
		return tipus;
		
		switch(tipus){
		
		case 1:
			return " ";
		
		}while((tipus<1||tipus>4));
		
	}*/
	
	
	
	

}


