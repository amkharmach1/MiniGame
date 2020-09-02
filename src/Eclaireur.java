
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
			int x = direction.getX();
			int y = direction.getY();
			if(dansLimites(x, y)) {
				Element e = this.lePlateau.plateau[x + this.x][y+this.y].getElement();
				if (!this.lePlateau.isFree(x+this.x, y+this.y) && e.isFlag()) {
					flagAround = true;
					Flag f = (Flag) e;
					f.discover();
				}
			}
			i++;
		} while (i < 4 && !flagAround);
	}

}
