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
	
	public void competence() {
		boolean flagAround = false;
		typeMouvement direction;
		int i = 0;
		do {
			direction = typeMouvement.values()[i];
			int x = direction.getX() + this.x;
			int y = direction.getY() + this.y;
			if(this.dansLimites(x, y)) {
				Element e = this.lePlateau.plateau[x][x].getElement();
				if (dansLimites(x, y) && !this.lePlateau.isFree(x, y) && e.isFlag()) {
					flagAround = true;
					Flag f = (Flag) e;
					if(f.isDiscovered()) {
						f.setIsTakenBy(this);
						this.hasFlag = true;
					}
				} 
			}
			i++;
		} while (i < 4 && !flagAround);
	}
}
