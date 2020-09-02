
public class Eclaireur extends Perso{

	public Eclaireur(int x, int y, Plateau lePlateau) {
		super(typePersonnages.ECLAIREUR, x, y, lePlateau);
	}


	public String toString() {
		return "⚡️";
	}
	
	public void competence() {
		boolean flagAround = false;
		typeMouvement direction;
		int i = 0;
		do {
			direction = typeMouvement.values()[i];
			int x = direction.getX() + this.x;
			int y = direction.getY() + this.y;
			Element e = this.lePlateau.plateau[x][x].getElement();
			if (dansLimites(x, y) && !this.lePlateau.isFree(x, y) && e.isFlag()) {
				flagAround = true;
				Flag f = (Flag) e;
				f.discover();
			} else {
				i++;
			}
		} while (i < 4 && !flagAround);
	}

}
