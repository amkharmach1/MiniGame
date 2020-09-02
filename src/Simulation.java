import java.util.Scanner;

public class Simulation {
	public static void menu() {
		System.out.println("\n\n");
		System.out.println(" ________           __                                                  __  __  ______  __    __  ________ \n" + 
				"|        \\         |  \\                                                |  \\|  \\|      \\|  \\  |  \\|        \\\n" + 
				"| $$$$$$$$ _______ | $$____    ______    _______         ______        | $$| $$ \\$$$$$$| $$  | $$ \\$$$$$$$$\n" + 
				"| $$__    /       \\| $$    \\  /      \\  /       \\       |      \\       | $$ \\$   | $$  | $$  | $$   | $$   \n" + 
				"| $$  \\  |  $$$$$$$| $$$$$$$\\|  $$$$$$\\|  $$$$$$$        \\$$$$$$\\      | $$      | $$  | $$  | $$   | $$   \n" + 
				"| $$$$$  | $$      | $$  | $$| $$    $$| $$             /      $$      | $$      | $$  | $$  | $$   | $$   \n" + 
				"| $$_____| $$_____ | $$  | $$| $$$$$$$$| $$_____       |  $$$$$$$      | $$     _| $$_ | $$__/ $$   | $$   \n" + 
				"| $$     \\\\$$     \\| $$  | $$ \\$$     \\ \\$$     \\       \\$$    $$      | $$    |   $$ \\ \\$$    $$   | $$   \n" + 
				" \\$$$$$$$$ \\$$$$$$$ \\$$   \\$$  \\$$$$$$$  \\$$$$$$$        \\$$$$$$$       \\$$     \\$$$$$$  \\$$$$$$     \\$$   \n" + 
				"                                                                                                         ");
		System.out.println("\n\n\n");
		System.out.println("   ___         __                     \n" + 
				"  <  /        / /___  __  _____  _____\n" + 
				"  / /    __  / / __ \\/ / / / _ \\/ ___/\n" + 
				" / /    / /_/ / /_/ / /_/ /  __/ /    \n" + 
				"/_(_)   \\____/\\____/\\__,_/\\___/_/     \n" + 
				"                                      \n" + 
				"\n" + 
				"");
		System.out.println("   ___        ____        _ __  __           \n" + 
				"  |__ \\      / __ \\__  __(_) /_/ /____  _____\n" + 
				"  __/ /     / / / / / / / / __/ __/ _ \\/ ___/\n" + 
				" / __/_    / /_/ / /_/ / / /_/ /_/  __/ /    \n" + 
				"/____(_)   \\___\\_\\__,_/_/\\__/\\__/\\___/_/     \n" + 
				"                                             "
				+ "\n");
		System.out.println("   _____      ____             __         \n" + 
				"  |__  /     / __ \\___  ____ _/ /__  _____\n" + 
				"   /_ <     / /_/ / _ \\/ __ `/ / _ \\/ ___/\n" + 
				" ___/ /    / _, _/  __/ /_/ / /  __(__  ) \n" + 
				"/____(_)  /_/ |_|\\___/\\__, /_/\\___/____/  \n" + 
				"                     /____/               "
				+ "\n");
		
		try (Scanner scan = new Scanner(System.in)) {
			String saisieUtil = scan.next();
			
			if(saisieUtil.equals("1")) Simulation.jouer();
			else if (saisieUtil.equals("2")) {
				System.out.println("Merci beaucoup !");
			} else if (saisieUtil.equals("3")) {
				Rules rule = new Rules();
				rule.afficherRegles();
				String out = scan.next();
				if(out.equals("q")) {
					Simulation.clean();
					Simulation.menu();
				}
			}
		}
	}
	
	private static void jouer() {
		clean();
		//Création du plateau
		Plateau plateau = new Plateau();
		
		//Team J1
		Leader lJ1 = new Leader(0, 0, plateau);
		Tank tJ1 = new Tank(1, 1, plateau);
		Sniper sJ1 = new Sniper(1, 0, plateau);
		Eclaireur eJ1 = new Eclaireur(0, 1, plateau);
		
		Joueur j1 = new Joueur(eJ1, tJ1, sJ1, lJ1, "J1");
		
		//Team J2
		Leader lJ2 = new Leader(7, 7, plateau);
		Tank tJ2 = new Tank(6, 6, plateau);
		Sniper sJ2 = new Sniper(6, 7, plateau);
		Eclaireur eJ2 = new Eclaireur(7, 6, plateau);
		
		Joueur j2 = new Joueur(eJ2, tJ2, sJ2, lJ2, "J2");
		
		//Placer les perso dans le Plateau
		for (int i = 0; i < j1.getPions().length; i++) {
			plateau.putPersoInPlateau(j1.getPions()[i]);
		}
		for (int i = 0; i < j2.getPions().length; i++) {
			plateau.putPersoInPlateau(j2.getPions()[i]);
		}
		
		//Placer l'objectif dans le plateau
		Flag f = new Flag(4, 4);
		plateau.putPersoInPlateau(f);
		
		
		//PLacer les murs dans le plateau
		Mur un = new Mur(1, 3);
		plateau.putPersoInPlateau(un);
		Mur deux = new Mur(3, 4);
		plateau.putPersoInPlateau(deux);
		Mur trois = new Mur(5, 3);
		plateau.putPersoInPlateau(trois);
		Mur quatre = new Mur(7, 4);
		plateau.putPersoInPlateau(quatre);
		
		//Afficher le plateau 
		//System.out.println(plateau);
		
		//Mouvements
		
		while(!j1.aPerdu() && !j2.aPerdu()) {
			j1.jouerTour();
			j2.jouerTour();
		}
	}
	
	public static void clean() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\n");
		}
	}
}
