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
	
	public void setPlateau(int x, int y, Perso e) {
		this.plateau[x][y] = e;
	}

	@Override
	public String toString() {
		String res = "";
		for(int i = 0; i < this.getLongueur(); i++) {
			for(int j = 0; j < this.getLargeur(); j++) {
				if (this.plateau[i][j] == null) res+="☐";
				else res+="X";
			}
			res+="\n";
		}
		return res;
	}
	
}
