package Entity;

public class User {
	private String name;
	private String password;
	public void setName(String newname) {
		name= newname;
	}
	public void setpassword(String newpassword) {
		this.password=newpassword;
	}
	
	public String getName() {
		return  name;
	}
	public String getpassword() {
		return  password;
	}
}
