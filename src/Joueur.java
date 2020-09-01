
public class Joueur {
	private Perso[] pions = new Perso[4];
	
	public Joueur(Perso e, Perso t, Perso s, Perso l) {
		pions[0] = e;
		pions[1] = t;
		pions[2] = s;
		pions[3] = l;
	}
	
	public void jouerTour() {
		for (int i = 0; i < 4; i++) {
			if (pions[i].isAlive()) {
				this.pions[i].jouer();
			}
		}
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
}

