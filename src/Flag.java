
public class Flag extends Element {
	protected boolean isDiscovered;
	protected Leader isTakenBy;
	
	public Flag (int x, int y) {
		super(x,y);
		isDiscovered = false;
		this.isTakenBy = null;
	}
	
	public boolean isDiscovered() {
		return this.isDiscovered;
	}
	
	public void discover() {
		this.isDiscovered = true;
	}
	
	public boolean isTaken() {
		return this.isTakenBy != null;
	}
	
	public void setIsTakenBy(Leader l) {
		this.isTakenBy = l;
	}
	
	public String toString() {
		if(this.isDiscovered()) return "🚩";
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
