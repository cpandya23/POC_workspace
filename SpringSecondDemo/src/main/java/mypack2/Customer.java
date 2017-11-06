package mypack2;

public class Customer {
	private String customerName;
	private int customerId;
	private Address homeAddress;
	private Address awayAddress;

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

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getAwayAddress() {
		return awayAddress;
	}

	public void setAwayAddress(Address awayAddress) {
		this.awayAddress = awayAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", homeAddress=" + homeAddress
				+ ", awayAddress=" + awayAddress + "]";
	}

}
