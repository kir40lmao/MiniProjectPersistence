package dataaccess;

import ModelLayer.Item;

public interface ItemDAOIn {
	void createItem();
	Item readItem();
	Item readItemById(int id);
	void updateItem();
	void deleteItem();
}
