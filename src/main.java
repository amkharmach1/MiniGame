
public class main {

	public static void main(String[] args) {
		Plateau t = new Plateau();
		Perso r = new Tank();
		t.setPlateau(2, 2, r);
		System.out.println(t);

	}

}
