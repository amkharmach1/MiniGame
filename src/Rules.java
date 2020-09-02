
public class Rules {
	String rule = "Bienvenue sur Echec à l'UIT.\n"
			+ "Il s'agit d'un jeu inspiré des echecs dans lequel vous devez récuperer un drapeau sur le plateau et le ramener dans votre camp.\n"
			+ "\n"
			+ "Le jeu se joue a 2 joueurs.\n"
			+ "Chacun à une équipe de 4 personnages composée d'un leader, d'un tank, d'un éclaireur et d'un sniper.\n"
			+ "\n"
			+ "Pour gagner, il faut soit ramener le drapeau dans son camp avec son leader, soit détruire l'équipe adverse.\n"
			+ "\n"
			+ "Pour récupérer le drapeau, il faut d'abord le trouver, pour cela il faut que l'Eclaireur finisse son tour \n"
			+ "a côté du drapeau caché, pour le récupérer, il faut que le Leader finisse son tour à côté du drapeau\n"
			+ "découvert.\n"
			+ "\n\n"
			+ "Quitter les regles en appuyant sur Q";
	
	public void afficherRegles() {
		Simulation.clean();
		System.out.println(this.rule);
	}
}
