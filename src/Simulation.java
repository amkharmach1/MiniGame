import java.util.Scanner;

public class Simulation {
	public static void menu() {
		System.out.println("1.Jouer");
		System.out.println("2.Quitter");
		
		try (Scanner scan = new Scanner(System.in)) {
			String saisieUtil = scan.next();
			
			if(saisieUtil.equals("1")) Simulation.jouer();
			else if (saisieUtil.equals("2")) {
				System.out.println("Merci beaucoup !");
			}
		}
	}
	
	private static void jouer() {
		//Création du plateau
		Plateau plateau = new Plateau();
		
		//Team J1
		Leader lJ1 = new Leader(0, 0, plateau);
		Tank tJ1 = new Tank(1, 1, plateau);
		Sniper sJ1 = new Sniper(1, 0, plateau);
		Eclaireur eJ1 = new Eclaireur(0, 1, plateau);
		
		Joueur j1 = new Joueur(lJ1, tJ1, sJ1, eJ1);
		
		//Team J2
		Leader lJ2 = new Leader(7, 7, plateau);
		Tank tJ2 = new Tank(6, 6, plateau);
		Sniper sJ2 = new Sniper(6, 7, plateau);
		Eclaireur eJ2 = new Eclaireur(7, 6, plateau);
		
		Joueur j2 = new Joueur(lJ2, tJ2, sJ2, eJ2);
		
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
		System.out.println(plateau);
	}
}
