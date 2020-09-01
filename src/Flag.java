
public class Flag extends Element {
	protected Leader isTakenBy;
	
	public Flag (int x, int y) {
		super(x,y);
		this.isTakenBy = null;
	}
	
	public boolean isTaken() {
		return this.isTakenBy != null;
	}
	
	public void setIsTakenBy(Leader l) {
		this.isTakenBy = l;
	}
	
	public String toString() {
		if(this.isTaken()) return "🚩";
		else return "⬜";
	}

	@Override
	public int getX() {
		return this.x;
	}

	@Override
	public int getY() {
		return this.x;
	}
}
