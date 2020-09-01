
public class Eclaireur extends Perso{

	public Eclaireur(int x, int y, Plateau lePlateau) {
		super(typePersonnages.ECLAIREUR, x, y, lePlateau);
	}


	public String toString() {
		return "⚡️";
	}

}
