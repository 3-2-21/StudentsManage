package student.inform;

public class Register{

	private String name;
	private String pwd;

	public Register() {
		
	}
	public Register( String name, String pwd) {
		super();
	
		this.name = name;
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}