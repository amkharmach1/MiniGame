
public class main {

	public static void main(String[] args) {
		Plateau t = new Plateau(8, 8);
		mouvement move = new mouvement();
		Perso l = new Leader(1,1);
		Perso s = new Sniper(2,2);
		Perso T = new Tank(3,3);
		Perso e = new Eclaireur(4,4);
		t.putPersoInPlateau(l);
		t.putPersoInPlateau(s);
		t.putPersoInPlateau(T);
		t.putPersoInPlateau(e);
		for(int i = 0; i < 10; i++) {
			System.out.flush();
			System.out.println(t);
			System.out.println(move.getMouvement());
			
		}


	}

}
