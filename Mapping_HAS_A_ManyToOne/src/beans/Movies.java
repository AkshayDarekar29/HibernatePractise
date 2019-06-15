package beans;

public class Movies {
	int mid;
	String mName;
	Actor a;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public Actor getA() {
		return a;
	}
	public void setA(Actor a) {
		this.a = a;
	}
	public Movies(int mid, String mName, Actor a) {
		super();
		this.mid = mid;
		this.mName = mName;
		this.a = a;
	}
	
	
}
