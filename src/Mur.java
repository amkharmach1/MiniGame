public class Mur extends Element {

	public Mur(int x, int y) {
		super(x, y);
	}

	public String toString() {
		return "🧱";
	}

	@Override
	public int getX() {
		return this.x;
	}

	@Override
	public int getY() {
		return this.y;
	}

}
