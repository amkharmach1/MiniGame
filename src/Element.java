
public abstract class Element {
	protected int x;
	protected int y;
	
	public Element (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract String toString();
	
	public abstract int getX();
	public abstract int getY();
	
	public boolean isPerso() {
		return (this instanceof Perso);
	}
	
	public boolean isFlag() {
		return (this instanceof Flag);
	}
}
