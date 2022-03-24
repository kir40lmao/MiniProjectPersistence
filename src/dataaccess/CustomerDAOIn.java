package dataaccess;

import ModelLayer.Customer;

public interface CustomerDAOIn {
	void createCustomer();
	Customer readCustomer();
	Customer readCustomerByPhoneNumber(int phoneNumber);
	void updateCustomer();
	void deleteCustomer();

}
