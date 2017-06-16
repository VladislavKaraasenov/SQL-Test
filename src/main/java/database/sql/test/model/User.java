package database.sql.test.model;

public class User {

	private int userId;
	private String firstName;
	private String city;
	private String phone;
	private String email;

	public User() {

	}

	public User(String firstName, String city, String phone, String email) {
		this.firstName = firstName;
		this.city = city;
		this.phone = phone;
		this.email = email;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return this.userId + ", " + this.firstName + ", " + this.city + ", " + this.phone + ", " + this.email;
	}

}
