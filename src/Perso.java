
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
		if(dansLimites(direction.getX(), direction.getY()) && this.lePlateau.isFree(direction.getX() + this.x, direction.getY() + this.y)) {
			this.lePlateau.getCase(this.x, this.y).setElement(null);
			this.x = this.x + direction.getX();
			this.y = this.y + direction.getY();
			this.lePlateau.getCase(this.x, this.y).setElement(this);
			return true;
		} else  {
			return false;
		}
	}
	
	public boolean dansLimites(int x, int y) {
		return (this.x + x >= 0 && this.x + x < this.lePlateau.getLargeur()) 
				&& (this.y + y >= 0 && this.y + y < this.lePlateau.getLongueur());
	}
	
	public void bouger() {
		Mouvement selection = new Mouvement();
		typeMouvement direction;
		int i = 0;
		if(!this.lePlateau.bloquer(this.x,this.y)) {
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
	}
	
	public void attaquer() {
		Mouvement mouv = new Mouvement();
		typeMouvement direction = mouv.getMouvement();
		int x = direction.getX();
		int y = direction.getY();
		if(dansLimites(x, y) 
				&& !this.lePlateau.isFree(x + this.x, y + this.y)) {
			
		}
	}
	
	public void jouer() {
		bouger();
		attaquer();
	}
	
	
}
