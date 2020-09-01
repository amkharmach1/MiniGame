
public enum typePersonnages {
	
	TANK(2,8,1,1), SNIPER(5,2,2,2), LEADER(1,5,2,1), ECLAIREUR(2,2,5,1);
	
	public int attaque;
	public int hp;
	public int deplacement;
	public int portee;
	
	private typePersonnages(int attaque, int hp, int deplacement, int portee) {
		this.attaque = attaque;
		this.hp = hp;
		this.deplacement = deplacement;
		this.portee = portee;
	}
	
}
