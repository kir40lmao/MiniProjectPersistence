package dataaccess;

public interface ItemDAOIn {
	void createItem();
	void readItem();
	void updateItem();
	void deleteItem();
	void readItemById(int id);
}
