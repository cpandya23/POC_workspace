package mypack_Annotations_JavaBasedConfig_practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Customer {
	@Value("Chintan")
	private String customerName;
	@Value("662321")
	private int customerId;
	
	@Autowired
	private Address address;
	
	public Customer() {
		System.out.println("Construct");
	}

	
	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", address=" + address + "]";
	}
	

	
	
	
}
