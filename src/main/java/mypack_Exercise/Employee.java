package mypack_Exercise;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {

	@Value("100")
	private int employeeId;

	@Value("Chintan")
	private String firstName;

	@Value("Pandya")
	private String lastName;

	@Value("SSE")
	private String role;

	@Value("27-10-1993")
	private String dateOfJoining;
	
	
	@Value("10000")
	private long Salary;

	@Autowired
	@Qualifier("officeAddress")
	private Address officeAddress;
	
	@Autowired
	@Qualifier("residentAddress")
	private Address residentAddress;

	@Value("999999")
	private long contactNumber;

	@Value("Chintan@")
	private String emailId;

	public Employee() {

	}

	public Employee(int employeeId, String firstName, String lastName, String role, String dateOfJoining, long salary,
			Address officeAddress, Address residentAddress, long contactNumber, String emailId) {

		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.dateOfJoining = dateOfJoining;
		Salary = salary;
		this.officeAddress = officeAddress;
		this.residentAddress = residentAddress;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		
		this.dateOfJoining = dateOfJoining;
	}

	public long getSalary() {
		return Salary;
	}

	public void setSalary(long salary) {
		Salary = salary;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Address getResidentAddress() {
		return residentAddress;
	}

	public void setResidentAddress(Address residentAddress) {
		this.residentAddress = residentAddress;
		
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", role="
				+ role + ", dateOfJoining=" + dateOfJoining + ", Salary=" + Salary + ", officeAddress=" + officeAddress
				+ ", residentAddress=" + residentAddress + ", contactNumber=" + contactNumber + ", emailId=" + emailId
				+ "]";
	}

}
