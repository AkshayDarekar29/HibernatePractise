package beans;

import java.util.Date;

public class Vote {
	int vid;
	String pname;
	Date cdate;
	Voter v;
	public Vote(int vid, String pname, Date cdate, Voter v) {
		super();
		this.vid = vid;
		this.pname = pname;
		this.cdate = cdate;
		this.v = v;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public Voter getV() {
		return v;
	}
	public void setV(Voter v) {
		this.v = v;
	}
	
	
}
