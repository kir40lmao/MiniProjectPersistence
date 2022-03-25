package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ItemDAO implements ItemDAOIn {
	
	DBConnection dbcon = DBConnection.getInstance();
	Connection conn = dbcon.getDBcon();
	
	@Override
	public void createItem() {
		String sql = "INSERT INTO Item (ID,ItemName,Price,CountryOfOrigin,CurrentStock,ClothingSize,ClothingColour,EquipmentType,EquipmentDescription,AccessoriesMaterial) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		 
		PreparedStatement statement;
		try {
			statement = conn.prepareStatement(sql);
			statement.setInt(1,28282830);
			statement.setString(2, "Handgun");
			statement.setInt(3, 400);
			statement.setString(4, "USA");
			statement.setInt(5, 7);
			statement.setString(6, null);
			statement.setString(7, null);
			statement.setString(8, "Prop Gun");
			statement.setString(9, "A simple prop hand gun");
			statement.setString(10, null);

			

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new item was inserted successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void readItem() {
		try {
		     
			String sql = "SELECT * FROM Item  ";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    int id = result.getInt("ID");
			    String itemName = result.getString("ItemName");
			    int price = result.getInt("Price");
			    String countryOfOrigin = result.getString("CountryOfOrigin");
			    String currentStock = result.getString("CurrentStock");
			    String clothingSize = result.getString("ClothingSize");
			    String clothingColour = result.getString("ClothingColour");
			    String equipmentType = result.getString("EquipmentType");
			    String equipmentDescription = result.getString("EquipmentDescription");
			    String accessoriesMaterial = result.getString("AccessoriesMaterial");


			 
			    String output = "Customer #%d: %s - %s - %s - %s - %s";
			    System.out.println(String.format(output, ++count, id,itemName,price,countryOfOrigin,currentStock,clothingSize,clothingColour,equipmentType,equipmentDescription,accessoriesMaterial));
			}
		     
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
		
	}

	@Override
	public void updateItem() {
		try { 
			String sql = "UPDATE Item SET ID=?,ItemName=?,Price=?,CountryOfOrigin=?,CurrentStock=?,ClothingSize=?,ClothingColour=?,EquipmentType=?,EquipmentDescription=?,AccessoriesMaterial=? WHERE ID=?";
			 
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1,28282822);
			statement.setString(2,"Handgun");
			statement.setInt(3, 400);
			statement.setString(4,"England");
			statement.setInt(5,7);
			statement.setString(6,null);
			statement.setString(7,null);
			statement.setString(8,"Prop Gun");
			statement.setString(9,"A realistic prop hand gun");
			statement.setString(10,null);
			statement.setInt(11,28282822);



			 
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
			    System.out.println("An existing customer was updated successfully!");
			}
		     
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
		
	}

	@Override
	public void deleteItem() {
		try {
		     
			String sql = "DELETE FROM Item WHERE ID=?";
			 
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, 28282828);
			 
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
			    System.out.println("A customer was deleted successfully!");
			}
		     
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}		
		
	}

	@Override
	public void readItemById(int ID) {
	  try {	
		String sql = "SELECT * FROM Item WHERE ID = '"+ID+"'";
		 
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		 
		int count = 0;
		 
		while (result.next()){
		    int id = result.getInt("ID");
		    String itemName = result.getString("ItemName");
		    int price = result.getInt("Price");
		    String countryOfOrigin = result.getString("CountryOfOrigin");
		    String currentStock = result.getString("CurrentStock");
		    String clothingSize = result.getString("ClothingSize");
		    String clothingColour = result.getString("ClothingColour");
		    String equipmentType = result.getString("EquipmentType");
		    String equipmentDescription = result.getString("EquipmentDescription");
		    String accessoriesMaterial = result.getString("AccessoriesMaterial");


		 
		    String output = "Customer #%d: %s - %s - %s - %s - %s";
		    System.out.println(String.format(output, ++count, id,itemName,price,countryOfOrigin,currentStock,clothingSize,clothingColour,equipmentType,equipmentDescription,accessoriesMaterial));
		}
	     
	} catch (SQLException ex) {
	    ex.printStackTrace();
	}
		
	}

}
