public class Leader extends Perso{
	
	public Leader(int x, int y, Plateau lePlateau) {
		super(typePersonnages.LEADER, x, y, lePlateau);
	}

	public String toString() {
		if(!this.hasFlag) return "👑";
		else return "🚩";
	}
	
	public void wounded(int damage) {
		System.out.println(this.toString() + " a perdu " + damage + " HP.");
		this.HP = this.HP - damage;
		if(!isAlive()) {
			this.lePlateau.plateau[x][y].setElement(null);
			if(this.hasFlag) {
				Flag f = new Flag(x,y);
				f.discover();
				this.lePlateau.plateau[x][y].setElement(f);
			}
		}
	}
	
	public void competence() {
		boolean flagAround = false;
		typeMouvement direction;
		int i = 0;
		do {
			direction = typeMouvement.values()[i];
			int x = direction.getX();
			int y = direction.getY();
			if(this.dansLimites(x, y)) {
				Element e = this.lePlateau.plateau[x+this.x][y+this.y].getElement();
				if (!this.lePlateau.isFree(x+this.x, y+this.y) && e.isFlag()) {
					flagAround = true;
					Flag f = (Flag) e;
					if(f.isDiscovered()) {
						f.setIsTakenBy(this);
						this.lePlateau.plateau[x+this.x][y+this.y].setElement(null);
						this.hasFlag = true;
					}
				} 
			}
			i++;
		} while (i < 4 && !flagAround);
	}
}
