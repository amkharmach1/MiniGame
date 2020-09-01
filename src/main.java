
public class main {

	public static void main(String[] args) {
		Plateau t = new Plateau(8, 8);
		Perso l = new Leader(1,1);
		Perso s = new Sniper(2,2);
		Perso T = new Tank(3,3);
		Perso e = new Eclaireur(4,4);
		t.putPersoInPlateau(l);
		t.putPersoInPlateau(s);
		t.putPersoInPlateau(T);
		t.putPersoInPlateau(e);
		System.out.println(t);

	}

}
