public class Main {

	public static void main(String[] args){
		/*Plateau t = new Plateau(8, 8);
		Mouvement move = new Mouvement();
		Perso l = new Leader(1,1);
		Perso s = new Sniper(2,2);
		Perso T = new Tank(3,3);
		Perso e = new Eclaireur(4,4);
		t.putPersoInPlateau(l);
		t.putPersoInPlateau(s);
		t.putPersoInPlateau(T);
		t.putPersoInPlateau(e);
		
		for(int i = 0; i < 10; i++) {
			try {
				if(System.getProperty("os.name" ).startsWith("Windows")) {
					Runtime.getRuntime().exec("cls");
				} else {
					Runtime.getRuntime().exec("clear");
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.out.println(t);
			System.out.println(move.getMouvement());
		}*/
		
		Simulation.menu();
		
	}
}
