
public abstract class Perso extends Element {
	protected int attack;
	protected int HP;
	protected int deplacement;
	
	public Perso(typePersonnages t) {
		this.attack = t.attaque;
		this.HP = t.hp;
		this.deplacement = t.deplacement;
		
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
	
	public abstract String toString();
}
