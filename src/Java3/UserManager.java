package Java3;


public class UserManager {
	
	public void list () {
		System.out.println("Tüm kullanıcılar listelendi");
	}
	
	public void add(User user) {
		System.out.println("Kullanici basari ile eklendi : " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("Kullanici basari ile silindi : " + user.getFirstName() + "" + user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("Kullanici basari ile güncellendi : " + user.getFirstName()+ " " + user.getLastName());
	}
	

}