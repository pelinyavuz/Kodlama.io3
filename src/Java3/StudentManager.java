package Java3;

public class StudentManager extends UserManager {

	public void add(Student student) {

		System.out.println("Ogreci basari ile olusturuldu :" + student.getFirstName() + " " + student.getLastName());
	}

	public void delete(Student student) {
		System.out.println("Ogreci basari ile silindi :" + student.getFirstName() + " " + student.getLastName());
	}

	public void update(Student student) {
		System.out.println("Ogreci basari ile güncellendi :"  + student.getFirstName() + " " + student.getLastName() );
	}

}