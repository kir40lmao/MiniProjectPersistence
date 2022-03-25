package ControlLayer;

import ModelLayer.Item;
import dataaccess.ItemDAO;

public class ItemController {
	Item item;
	ItemDAO idao = new ItemDAO();

	public Item returnItem(int id) {
		return idao.readItemByID(id);
	}
	
	public void createItem(Item item) {
		idao.createItem(item);
	}

	public void readItem(Item item) {
		idao.readItem(item);
	}

	public void updateItem(Item item) {
		idao.updateItem(item);
	}

	public void deleteItem(Item item) {
		idao.deleteItem(item);
	}
}	