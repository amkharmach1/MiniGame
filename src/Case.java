
public class Case {
	protected Element e;
	protected int posX;
	protected int posY;
	
	public Case(int x, int y) {
		this.e = null;
	}
	
	public Element getElement() {
		return this.e;
	}
	
	public void setElement(Element e) {
		this.e = e;
	}
	
	public int getPosX() {
		return this.posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
	
	public void setPosCase(int x, int y) {
		this.posX = x;
		this.posY = y;
	}
	
	public String toString() {
		if(this.e == null) {
			return "⬜";
		} else {
			return this.e.toString();
		}
	}
}
