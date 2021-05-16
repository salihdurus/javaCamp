package GoogleService;

public class AccountManager {
	private String mail="asd@asd.com";
	private String password="123456789";
	
	public boolean SignUp(String mail,String password) {
		if(this.mail==mail && this.password==password) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
}
