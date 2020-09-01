
public class Joueur {
	private Perso[] pions = new Perso[4];
	
	public Joueur(Eclaireur eclair, Tank tank, Sniper sniper, Leader leader) {
		pions[0] = eclair;
		pions[1] = tank;
		pions[2] = sniper;
		pions[3] = leader;
	}
	
	public void jouerTour() {
		for (int i = 0; i < 4; i++) {
			if (pions[i].isAlive()) {
				
			}
		}
	}
}
