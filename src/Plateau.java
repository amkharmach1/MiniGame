import java.util.Arrays;

public class Plateau {
	private int x;//longueur
	private int y;//largeur
	
	Perso plateau[][];
	
	
	public Plateau(int x, int y) {
		this.x = x;
		this.y = y;
		this.plateau = new Perso[8][8];
	}
	
	public Plateau() {
		this(8, 8);
	}

	public int getLongueur() {
		return x;
	}

	public int getLargeur() {
		return y;
	}

	@Override
	public String toString() {
		String res = "|";
		for(int i = 0; i < this.getLongueur(); i++) {
			
		}
		return res;
	}
	
	
	
	
	
}
