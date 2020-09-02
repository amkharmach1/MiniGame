
public abstract class Perso extends Element {
	protected int attack;
	protected int HP;
	protected int deplacement;
	protected int portee;
	protected Plateau lePlateau;
	protected boolean hasFlag;
	protected typePersonnages type;
	
	public Perso(typePersonnages t, int x, int y, Plateau lePlateau) {
		super(x,y);
		this.type = t;
		this.attack = t.attaque;
		this.HP = t.hp;
		this.deplacement = t.deplacement;
		this.portee = t.portee;
		this.lePlateau = lePlateau;
		this.hasFlag = false;
	}
	
	public typePersonnages getType() {
		return this.type;
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
		System.out.println(this.toString() + " a perdu " + damage + " HP.");
		this.HP = this.HP - damage;
		if(!isAlive()) {
			this.lePlateau.plateau[x][y].setElement(null);
		}
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
				System.out.println(this.toString()+"     ATTAQUE:"+this.attack+"   VIE:"+this.HP);
				System.out.println((deplacement-i)+" déplacement(s) restant(s)");
				System.out.print(this.lePlateau.toString());
				 direction = selection.getMouvement();
				 if(direction != null && direction != typeMouvement.STOP) {
					 if(accomplirMouvement(direction)) {
						 i++;
					 }				 
				 }
				 Simulation.clean();
			} while(i < this.deplacement && direction != typeMouvement.STOP);
		}
	}
	
	public void attaquer() {
		System.out.println(this.toString()+"     ATTAQUE:"+this.attack+"   VIE:"+this.HP);
		System.out.println("ATTAQUE");
		System.out.println(this.lePlateau.toString());
		Mouvement mouv = new Mouvement();
		typeMouvement direction = mouv.getMouvement();
		int x = direction.getX() * this.portee;
		int y = direction.getY() * this.portee;
		if((dansLimites(x+this.x, y+this.y) && !this.lePlateau.isFree(x + this.x, y + this.y)) && direction != typeMouvement.STOP) {
			Element target = this.lePlateau.plateau[x + this.x][y + this.y].getElement();
			if (target.isPerso()) {
				Perso persoCible = (Perso) target;
				persoCible.wounded(this.attack);
			}
		}
		Simulation.clean();
	}
	
	protected void competence() {
		
	}
	
	public void jouer() {
		bouger();
		attaquer();
		competence();
	}
	
	
}
