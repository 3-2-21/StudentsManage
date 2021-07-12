package student.inform;

public class Student{
	private int sno;
	private String sname;
	private String sgender;
	private int  sage;
	private String smajor;
	private String sphone;
	
	public Student() {
		
	}

	public Student( String sname, String sgender, int sage, String smajor, String  sphone) {
		this.sname = sname;
		this.sgender = sgender;
		this.sage = sage;
		this.smajor = smajor;
		this.sphone = sphone;
	}

	public Student(int sno, String sname, String sgender, int sage, String smajor, String  sphone) {
		
		this.sno = sno;
		this.sname = sname;
		this.sgender = sgender;
		this.sage = sage;
		this.smajor = smajor;
		this.sphone = sphone;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}

	

	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender) {
		this.sgender = sgender;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSmajor() {
		return smajor;
	}
	public void setSmajor(String smajor) {
		this.smajor = smajor;
	}
	public String  getSphone() {
		return sphone;
	}
	public void setSphone(String  sphone) {
		this.sphone = sphone;
	}
	

	public String toString() {
		return "Student [sno=" + sno + ",  sname=" + sname + ", sgender=" + sgender + ", sage=" + sage
				+ ", smajor=" + smajor + ", sphone=" + sphone + "]";
	}
 	
}