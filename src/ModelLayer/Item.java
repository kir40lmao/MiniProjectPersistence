package ModelLayer;

public class Item {
 private int id;
 private String name;
 private Double price;
 private String CountryOfOrigin;
 private int minStock;
 private int currentStock;
 private Item Item;
 
 
public Item(int id, String name, Double price, String countryOfOrigin, int minStock, int currentStock) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	CountryOfOrigin = countryOfOrigin;
	this.minStock = minStock;
	this.currentStock = currentStock;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public Double getPrice() {
	return price;
}


public void setPrice(Double price) {
	this.price = price;
}


public String getCountryOfOrigin() {
	return CountryOfOrigin;
}


public void setCountryOfOrigin(String countryOfOrigin) {
	CountryOfOrigin = countryOfOrigin;
}


public int getMinStock() {
	return minStock;
}


public void setMinStock(int minStock) {
	this.minStock = minStock;
}


public int getCurrentStock() {
	return currentStock;
}


public void setCurrentStock(int currentStock) {
	this.currentStock = currentStock;
}
 
public Item returnItem(){
	return this.Item;
	
}
}
