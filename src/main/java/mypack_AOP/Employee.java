package mypack_AOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	//@Value("Chintan")
	private String ename;
	
	private String role;
	@Autowired
	private Address address;
	public Employee() {
		System.out.println("Construct");
	}

	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Address getAddress() {
		return address;
	}
//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String display() throws Exception {
		if(ename==null) {
			throw new Exception("Invalid name");
		}
		else {
			return "Employee [ename=" + ename + ", role=" + role + ", address=" + address + "]";
		}
	
	}
	public String empId() {
		return "100";
	}
	
	public double calculateSalary(String role) {
		if(role.equals("manager")) {
			return 75000;
		}
		else {
			return 60000;
		}
	}
	
	
	
	
}
