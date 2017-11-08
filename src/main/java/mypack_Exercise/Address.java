package mypack_Exercise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {


	
	private int addressId;
	
	private String country;
	
	private String city;
	
	private String street;
	
	private long pincode;
	
	public Address() {
		
	}

	public Address(int addressId, String country, String city, String street, long pincode) {
	
		this.addressId = addressId;
		this.country = country;
		this.city = city;
		this.street = street;
		this.pincode = pincode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", country=" + country + ", city=" + city + ", street=" + street
				+ ", pincode=" + pincode + "]";
	}
	
	
	
}
