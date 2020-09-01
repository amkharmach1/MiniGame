
public abstract class Perso extends Element {
	protected int attack;
	protected int HP;
	protected int deplacement;
	protected Plateau lePlateau;
	
	public Perso(typePersonnages t, int x, int y, Plateau lePlateau) {
		super(x,y);
		this.attack = t.attaque;
		this.HP = t.hp;
		this.deplacement = t.deplacement;
		this.lePlateau = lePlateau;
	}
	
	public void setCoor(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public int getAttack() {
		return attack;
	}

	public int getHP() {
		return HP;
	}

	public int getDeplacement() {
		return deplacement;
	}
	
	public void wounded(int damage) {
		this.HP = this.HP - damage;
	}
	
	public boolean isAlive() {
		return this.HP > 0;	
	}
	
	public boolean accomplirMouvement(typeMouvement direction) {
		if(dansLimites(direction) && this.lePlateau.isFree(direction.getX() + this.x, direction.getY() + this.y)) {
			this.lePlateau.getCase(this.x, this.y).setElement(null);
			this.x = this.x + direction.getX();
			this.y = this.y + direction.getY();
			this.lePlateau.getCase(this.x, this.y).setElement(this);
			return true;
		} else  {
			return false;
		}
	}
	
	public boolean dansLimites(typeMouvement direction) {
		return (this.x + direction.getX() >= 0 && this.x + direction.getX() < this.lePlateau.getLargeur()) 
				&& (this.y + direction.getY() >= 0 && this.y + direction.getY() < this.lePlateau.getLongueur());
	}
	
	public void bouger() {
		Mouvement selection = new Mouvement();
		typeMouvement direction;
		int i = 0;
		do {
			 direction = selection.getMouvement(); 
			 if(direction != null) {
				 if(accomplirMouvement(direction)) {
					 i++;
				 }
				 
			 }
			 System.out.println(this.lePlateau.toString());
		} while(i < this.deplacement);
	}
	
	public void jouer() {
		bouger();
	}
	
	
}
