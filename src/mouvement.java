import java.util.Scanner;

public class mouvement {
	
	public Scanner scan;
	
	public mouvement() {
		this.scan = new Scanner(System.in);
	}
	
	public typeMouvement getMouvement() {
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
		default:
			return null;
		}
	}
	
}
