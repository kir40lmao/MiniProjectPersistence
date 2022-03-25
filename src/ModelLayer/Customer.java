package ModelLayer;

import java.util.HashMap;

public class Customer {
	private String name;
	private String address;
	private int zipcode;
	private int phoneNo;
	private String type;
	Customer customer;

	public static HashMap<Integer, Customer> customers = new HashMap<>();

	public Customer(String name, String address, int zipcode, int phoneNo, String type) {
		super();
		this.name = name;
		this.address = address;
		this.zipcode = zipcode;
		this.phoneNo = phoneNo;
		this.type = type;
		customers.put(phoneNo, this.customer);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getZipcode() {
		return zipcode;
	}


	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}


	public int getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

}
