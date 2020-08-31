
public abstract class Perso {
	protected int attack;
	protected int HP;
	protected int deplacement;
	
	public Perso(int atk, int hp, int deplacement) {
		this.attack = atk;
		this.HP = hp;
		this.deplacement = deplacement;
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
}
