package ControlLayer;
import ModelLayer.Order;
public class OrderController {
	public void addToOrder(int id, Object object) {
		Order order = new Order();
		order.addToOrder(id, object);
	}

	public void checkAvailability(int id, int amount) {
		id = ItemController.getId();
		amount = ItemController.getStock(id);
	}


	public int discountHandlling(int phoneNo,int totalPrice) {
		String type;
		int finalPrice = totalPrice;
		CustomerController cc = new CustomerController();
		type = cc.checkCustomerType(phoneNo);
		if(totalPrice>= 1500) {
			if(type.equalsIgnoreCase("company")) {
				finalPrice = totalPrice - totalPrice/10;
			}
		}
		if(totalPrice < 2500) {
			if(type.equalsIgnoreCase("private")) {
				finalPrice = totalPrice + 45;
			}
		}
		return finalPrice;
	}
}
