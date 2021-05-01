package Java3;

public class InstructorManager extends UserManager {
	
	public void add(Instructor instructor) {
		System.out.println("Egitmen Eklendi : " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void delete(Instructor instructor) {
		System.out.println("Egitmen Silindi : " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void update(Instructor instructor) {
		System.out.println("Egitmen Güncellendi : " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	
}