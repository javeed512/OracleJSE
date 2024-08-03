package user.service;

public class User {
	
	private  String username;
	private  String password;
	
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	
	
	

}
