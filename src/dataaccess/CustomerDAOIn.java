package dataaccess;

public interface CustomerDAOIn {
	void createCustomer();
	void readCustomer();
	void updateCustomer();
	void deleteCustomer();
	void readCustomerByPhoneNumber(int phoneNumber);
}
