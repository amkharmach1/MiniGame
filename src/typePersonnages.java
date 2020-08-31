
public enum typePersonnages {
	
	TANK(2,8,1), SNIPER(5,2,2), LEADER(1,5,2), ECLAIREUR(2,2,5);
	
	public int attaque;
	public int hp;
	public int deplacement;
	
	private typePersonnages(int attaque, int hp, int deplacement) {
		this.attaque = attaque;
		this.hp = hp;
		this.deplacement = deplacement;
	}
	
}
