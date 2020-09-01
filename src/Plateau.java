public class Plateau {
	private int x;//longueur
	private int y;//largeur
	
	protected Case plateau[][];
	
	
	public Plateau(int x, int y) {
		this.x = x;
		this.y = y;
		this.plateau = new Case[x][y];
		setCasePos();
	}
	
	public Plateau() {
		this(8, 8);
	}

	public int getLongueur() {
		return this.x;
	}

	public int getLargeur() {
		return this.y;
	}

	public void putPersoInPlateau(Perso p) {
		this.plateau[p.getX()][p.getY()].setElement(p);
	}
	
	public void setCasePos() {
		for(int i = 0; i < this.x; i++) {
			for(int j = 0; j < this.y; j++) {
				this.plateau[i][j] = new Case(i, j);
			}
		}
	}

	@Override
	public String toString() {
		String res = "";
		for(int i = 0; i < this.getLongueur(); i++) {
			for(int j = 0; j < this.getLargeur(); j++) {
				res += this.plateau[i][j];
			}
			res+="\n";
		}
		return res;
	}
	
}
