package student.inform;

public class Pay {
	private int pid;
	private String pname;
	private double pmoney;
	
		public Pay() {		
		}
		public Pay(int pid, String pname, double pmoney) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.pmoney = pmoney;
		}		
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public double getPmoney() {
			return pmoney;
		}
		public void setPmoney(double pmoney) {
			this.pmoney = pmoney;
		}
		 @Override
		public String toString() {
			return "Pay [pid=" + pid + ", pname=" + pname + ", pmoney=" + pmoney + "]";
			}

}
