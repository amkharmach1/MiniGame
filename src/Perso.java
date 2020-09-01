
public abstract class Perso extends Element {
	protected int attack;
	protected int HP;
	protected int deplacement;
	
	public Perso(typePersonnages t, int x, int y) {
		super(x,y);
		this.attack = t.attaque;
		this.HP = t.hp;
		this.deplacement = t.deplacement;
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
	
	public void jouer() {
		//TODO Faire les actions
	}
	
	
}
