package mypack;

import java.util.ArrayList;
import java.util.List;



public class CustomerBean2 {

	private int CustomerId;
	private String CustomerName;
	private List<Address> addresses= new ArrayList<>();
	
	
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	
	
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "CustomerBean2 [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", addresses=" + addresses
				+ "]";
	}

}
