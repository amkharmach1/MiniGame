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
		
	}
}
