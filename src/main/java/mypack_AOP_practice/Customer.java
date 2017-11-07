package mypack_AOP_practice;

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
	@Value("23")
	private int customerAge;

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

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public void validateAge(int age) throws Exception {
		if (age > 10) {
			System.out.println("Customer can shop online");
		}

		else {
			throw new Exception("Invalid Age");
		}
	}

}
