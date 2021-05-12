package day3HomeWork2;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor=new Instructor() ;
		instructor.setId(1);
		instructor.setFirstName("Engin Demiroğ");
		instructor.setLastName("Demiroğ");
		instructor.setMail("engindemirog@gmail.com");
		instructor.setPassword("123456");
		instructor.setDetails("asd");

		Student student =new Student();
		student.setId(2);
		student.setFirstName("Salih");
		student.setLastName("Dürüs");
		student.setMail("durussalih@gmail.com");
		student.setPassword("123456");
		
		UserManager userManager1=new InstructorManager();
		userManager1.add(instructor);
		userManager1.update(instructor);
		userManager1.remove(instructor);
		
		UserManager userManager2=new StudentManager();
		userManager2.add(student);
		userManager2.update(student);
		userManager2.remove(student);
	}

}
