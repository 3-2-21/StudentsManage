package student.inform;

public class Major{
	private int mid;
	private String mname;
	private String minclude;
	
	public Major() {
		
	}
	public Major(int mid, String mname, String minclude) {
	
		this.mid = mid;
		this.mname = mname;
		this.minclude = minclude;
	}
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMinclude() {
		return minclude;
	}
	public void setMinclude(String minclude) {
		this.minclude = minclude;
	}
	
	@Override
	public String toString() {
		return "Major [mid=" + mid + ", mname=" + mname + ", minclude=" + minclude + "]";
	}
	
	
 	
}