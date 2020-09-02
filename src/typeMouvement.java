
public enum typeMouvement {
	
	HAUT(0,-1), BAS(0,1), GAUCHE(-1,0), DROITE(1,0), ATTAQUE(0,0);
	
	public int x;
	public int y;
	
	private typeMouvement(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int  getY() {
		return this.y;
	}
}
