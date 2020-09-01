import java.util.Scanner;

public class Simulation {
	public static void menu() {
		System.out.println("1.Jouer");
		System.out.println("2.Quitter");
		
		Scanner scan = new Scanner(System.in);
		
		String saisieUtil = scan.next();
		
		if(saisieUtil.equals("1")) Simulation.jouer();
		else if (saisieUtil.equals("2")) {
			System.out.println("Merci beaucoup !");
		}
	}
	
	public static void jouer() {
		//Team J1
		Leader lJ1 = new Leader(0, 0);
		Tank tJ1 = new Tank(1, 1);
		Sniper sJ1 = new Sniper(1, 0);
		Eclaireur eJ1 = new Eclaireur(0, 1);
		
		Joueur j1 = new Joueur(lJ1, tJ1, sJ1, eJ1);
		
		//Team J2
		Leader lJ2 = new Leader(7, 7);
		Tank tJ2 = new Tank(6, 6);
		Sniper sJ2 = new Sniper(6, 7);
		Eclaireur eJ2 = new Eclaireur(7, 6);
		
		Joueur j2 = new Joueur(lJ2, tJ2, sJ2, eJ2);
		
		//Placer les perso dans le Plateau
		Plateau plateau = new Plateau();
		for (int i = 0; i < j1.getPions().length; i++) {
			plateau.putPersoInPlateau(j1.getPions()[i]);
		}
		for (int i = 0; i < j2.getPions().length; i++) {
			plateau.putPersoInPlateau(j2.getPions()[i]);
		}
		
		//Afficher le plateau 
		System.out.println(plateau);
	}
}
