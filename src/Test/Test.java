package Test;

import static org.junit.jupiter.api.Assertions.*;

import ControlLayer.CustomerController;
import ControlLayer.OrderController;
import dataaccess.CustomerDAO;
import dataaccess.DBConnection;

class Test {
	
	OrderController orderController = new OrderController();
	int phoneNo; 
	int totalPrice;
	int expectedFinalPrice;
	String expectedCustomerType;
	
	CustomerDAO customerDAO = new CustomerDAO();
	
	@org.junit.jupiter.api.Test
	void testCheckCustomerType() {
		customerDAO.readCustomer();
		expectedCustomerType = "private";
		CustomerController cc = new CustomerController();
		assertEquals(expectedCustomerType,cc.checkCustomerType(12345678));
		
	}
	void testDBConnection() {
		DBConnection.getInstance();
	}
	void testDiscountPrivateAbove() {
		customerDAO.readCustomer();
		phoneNo = 11111111;
		totalPrice = 2700;
		expectedFinalPrice = 2700;
		assertEquals(expectedFinalPrice,orderController.discountHandlling(phoneNo, totalPrice));
	}
	void testDiscountCompanyAbove() {
		customerDAO.readCustomer();
		phoneNo = 23232323;
		totalPrice = 1900;
		expectedFinalPrice = 1710;
		assertEquals(expectedFinalPrice,orderController.discountHandlling(phoneNo, totalPrice));
	}
	void testDiscountCompanyBelow() {
		customerDAO.readCustomer();
		phoneNo = 87654321;
		totalPrice = 100;
		expectedFinalPrice = 100;
		assertEquals(expectedFinalPrice,orderController.discountHandlling(phoneNo, totalPrice));
	}
	


}
