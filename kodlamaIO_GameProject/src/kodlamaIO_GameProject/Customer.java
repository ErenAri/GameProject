package kodlamaIO_GameProject;

public class Customer {
	private int id;
	private String FirstName;
	private String LastName;
	private long NationalyIdentity;
	private int BirthYear;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public long getNationalyIdentity() {
		return NationalyIdentity;
	}
	public void setNationalyIdentity(long nationalyIdentity) {
		NationalyIdentity = nationalyIdentity;
	}
	public int getBirthYear() {
		return BirthYear;
	}
	public void setBirthDate(int birthYear) {
		BirthYear = birthYear;
	}
}
