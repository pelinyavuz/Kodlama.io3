package Java3;

public class Instructor extends User {
	
	private String description;

	public Instructor() {
	}

	public Instructor(int id, String userName, String password, String firstName, String lastName, String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}