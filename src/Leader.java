public class Leader extends Perso{
	public Leader(int x, int y, Plateau lePlateau) {
		super(typePersonnages.LEADER, x, y, lePlateau);
	}

	public String toString() {
		return "♚";
	}
}
