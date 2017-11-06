package mypack;

public class CustomerBean {

	private int CustomerId;
	private String CustomerName;
	
	
	public CustomerBean() {
		
	}
	public CustomerBean(int customerId, String customerName) {
	
		CustomerId = customerId;
		CustomerName = customerName;
	}
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
	
	public void display() {
		System.out.println("CustomerId"+CustomerId+" CustomerName"+CustomerName);
	}
}
