
public abstract class Perso {
	protected int attack;
	protected int HP;
	protected int deplacement;
	
	public Perso() {
		
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
}
