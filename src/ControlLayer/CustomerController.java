package ControlLayer;

import ModelLayer.Customer;
import dataaccess.CustomerDAO;

public class CustomerController {
	Customer customer;
	CustomerDAO cdao = new CustomerDAO();
	
	public String checkCustomerType(int phoneNo) {
		customer = null;
		for(int phoneNumbers: Customer.customers.keySet()) {
			if (phoneNo == phoneNumbers) {
				customer = Customer.customers.get(phoneNumbers);
			}
		}
		if (customer == null) {
			System.out.println("Nonexistent customer number");
			return null;
		}
		System.out.println(customer.getType());
		return customer.getType();
	}
	
	public void createCustomer(Customer customer) {
		cdao.createCustomer(customer);
	}
	
	public void returnCustomers() {
		cdao.readCustomer();
	}
	
	public void returnCustomer(int id) {
		cdao.readCustomerById(id);
	}
	
	public void updateCustomer(Customer customer) {
		cdao.updateCustomer(customer);
	}
	
	public void deleteCustomer(Customer customer) {
		cdao.deleteCustomer(customer);
	}
}