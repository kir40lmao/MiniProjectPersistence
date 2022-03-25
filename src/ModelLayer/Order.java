package ModelLayer;

import java.util.HashMap;
import ControlLayer.OrderController;
public class Order {

	HashMap<Integer, Object> orderlist = new HashMap<>();
	
	public void createOrder() {
		if(!(orderlist.isEmpty())) {
			orderlist.clear();
		}
	}
	
	public HashMap<Integer, Object> returnOrder() {
		return orderlist;
	}
	public void addToOrder(int id, Object object) {
		id = Item.getId();
		object = Item.returnItem();
		orderlist.put(id, object);
	}
	
	public void finishOrder() {
		orderlist.clear();
	}
	
	public void cancelOrder() {
		orderlist.clear();
	}
	
	public void removeFromOrder(int id) {
		orderlist.remove(id);
	}
}

