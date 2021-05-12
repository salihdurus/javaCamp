package day3HomeWork2;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName()+" Eklendi");
	}
	public void remove(User user) {
		System.out.println(user.getFirstName()+" Silindi");
	}
	public void update(User user) {
		System.out.println(user.getFirstName()+" Güncellendi");
	}
}
