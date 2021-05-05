package InterfaceAbstractOdev.Entities;

import java.util.Date;

public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBird;
	private String nationalityId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBird() {
		return dateOfBird;
	}
	public void setDateOfBird(int dateOfBird) {
		this.dateOfBird = dateOfBird;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
}
