package mypack_Annotations_ComponentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	@Value("Ckp")
	private String ename;
	@Value("SSC")
	private String role;
	@Autowired
	private Address address;
	public Employee() {
		System.out.println("Construct");
	}
/*	@Autowired
	public Employee(String ename, String role, Address address) {
		
		this.ename = ename;
		this.role = role;
		this.address = address;
		System.out.println("param Construct");
	}*/
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
	
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", role=" + role + ", address=" + address + "]";
	}
	
	
	
	
}
