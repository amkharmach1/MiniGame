
public class Etat {
	protected Joueur[] j;
	
	public Etat(Joueur j1, Joueur j2) {
		j = new Joueur[2];
		j[0] = j1;
		j[1] = j2;
	}
	
	public void afficherEtat() {
		String etat = "";
		for(int i = 0; i < j.length; i++) {
			for(int o = 0; o < j[i].getPions().length; o++) {
				etat = "J" + i + ": \n";
				for(int p = 0; p < j[i].getPions().length; p++) {
					etat += "" + j[i].getPions()[p].toString() + " - Vie: " + j[i].getPions()[p].getHP() + " - Attaque: " + j[i].getPions()[p].getAttack() + " - Nombre de déplacement max: " + j[i].getPions()[p].getType().deplacement + "\n";
				}
			}
			System.out.println(etat);
			etat = "";
		}
	}
}
