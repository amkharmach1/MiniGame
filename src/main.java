
public class main {

	public static void main(String[] args) {
		Plateau t = new Plateau();
		Perso l = new Leader();
		Perso s = new Sniper();
		Perso T = new Tank();
		Perso e = new Eclaireur();
		t.setPlateau(2, 2, l);
		t.setPlateau(3, 3, s);
		t.setPlateau(4, 4, T);
		t.setPlateau(5, 5, e);
		System.out.println(t);

	}

}
