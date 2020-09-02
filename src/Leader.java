public class Leader extends Perso{
	
	public Leader(int x, int y, Plateau lePlateau) {
		super(typePersonnages.LEADER, x, y, lePlateau);
	}

	public String toString() {
		return "👑";
	}
	
	public void wounded(int damage) {
		System.out.println(this.toString() + " a perdu " + damage + " HP.");
		this.HP = this.HP - damage;
		if(!isAlive()) {
			this.lePlateau.plateau[x][y].setElement(null);
			if(this.hasFlag) {
				this.lePlateau.plateau[x][y].setElement(new Flag(x,y));
			}
		}
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
				f.setIsTakenBy(this);
				this.hasFlag = true;
			} else {
				i++;
			}
		} while (i < 4 && !flagAround);
	}
}
