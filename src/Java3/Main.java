package Java3;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("Pelin");
		user.setLastName("Yavuz");

		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setDescription("kodlama.io");

		Student student = new Student();
		student.setId(2);
		student.setFirstName("Pelin");
		student.setLastName("Yavuz");

		UserManager userManager = new UserManager();
		userManager.add(user);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);

		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
	}

}
