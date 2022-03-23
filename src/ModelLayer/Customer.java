package ModelLayer;

public class Customer {
private String name;
private String address;
private int zipcode;
private String city;
private int phoneNo;
private String type;


public Customer(String name, String address, int zipcode, String city, int phoneNo, String type) {
	super();
	this.name = name;
	this.address = address;
	this.zipcode = zipcode;
	this.city = city;
	this.phoneNo = phoneNo;
	this.type = type;
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


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
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
