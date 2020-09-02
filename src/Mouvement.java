import java.util.Scanner;

public class Mouvement {
	
	public Scanner scan;
	
	public Mouvement() {
		this.scan = new Scanner(System.in);
	}
	
	public typeMouvement getMouvement() {
		System.out.println("\nSaisir la direction voulu (ZQSD ou A pour passer au tour d'attaque): \n");
		String input = scan.next();
		switch (input.charAt(0)) {
		case 'z':
		case 'Z':
			return typeMouvement.HAUT;
		case 's':
		case 'S':
			return typeMouvement.BAS;
		case 'd':
		case 'D':
			return typeMouvement.DROITE;
		case 'q':
		case 'Q':
			return typeMouvement.GAUCHE;
		case 'a':
		case 'A':
			return typeMouvement.STOP;
		default:
			return null;
		}
	}
	
}
