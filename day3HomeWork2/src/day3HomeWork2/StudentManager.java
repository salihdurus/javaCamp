package day3HomeWork2;

public class StudentManager extends UserManager{
	public void add(User user) {
		System.out.println("��renci eklendi :"+user.getFirstName());
	}
}
