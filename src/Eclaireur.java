
public class Eclaireur extends Perso{

	public Eclaireur(int x, int y, Plateau lePlateau) {
		super(typePersonnages.ECLAIREUR, x, y, lePlateau);
	}


	public String toString() {
		return "⚡️";
	}
	
	public void competance() {
		boolean flagAround = false;
		typeMouvement direction;
		int i = 0;
		do {
			direction = typeMouvement.values()[i];
			Element e = this.lePlateau.plateau[direction.getX() + x][direction.getY() + y].getElement();
			if (e.isFlag()) {
				flagAround = true;
				Flag f = (Flag) e;
				f.discover();
			} else {
				i++;
			}
		} while (i < 4 && !flagAround);
	}

}
