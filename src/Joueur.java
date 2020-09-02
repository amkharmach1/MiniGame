
public class Joueur {
	private Perso[] pions = new Perso[4];
	private String name;
	int startX;
	int startY;
	
	public Joueur(Perso e, Perso t, Perso s, Perso l, String name) {
		pions[0] = e;
		pions[1] = t;
		pions[2] = s;
		pions[3] = l;
		this.name = name;
		this.startX = l.getX();
		this.startY = l.getY();
	}
	
	public void jouerTour(Etat etat) {
		System.out.println("Tour du joueur : " + this.name);
		for (int i = 0; i < 4; i++) {
			if (pions[i].isAlive()) {
				this.pions[i].jouer(etat);
			}
			Simulation.clean();
		}
	}
	
	public Perso[] getPions() {
		return this.pions;
	}
	
	public boolean aPerdu() {
		boolean aPerdu = true;
		int i = 0;
		while (aPerdu && i < 4) {
			if(this.pions[i].isAlive()) {
				aPerdu = false;
			}
			i++;
		}
		return aPerdu;
	}
	
	public boolean aGagne() {
		return this.pions[3].getX() == this.startX && this.pions[3].getY() == this.startY && this.pions[3].hasFlag;
	}
}

