
public class Flag extends Element {
	protected Leader isTakenBy;
	
	public Flag (int x, int y) {
		super(x,y);
		this.isTakenBy = null;
	}
	
	public void setIsTakenBy(Leader l) {
		this.isTakenBy = l;
	}
}
