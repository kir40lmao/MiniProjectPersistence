package dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerResultSet;

import ModelLayer.Customer;

public class CustomerDAO implements CustomerDAOIn{
	DBConnection dbcon = DBConnection.getInstance();
	Connection conn = dbcon.getDBcon();
	@Override
	public void createCustomer() {
		String sql = "INSERT INTO Customer (PhoneNumber,CustomerName,CustomerAddress,ZipCode,CustomerType) VALUES (?, ?, ?, ?, ?)";
		 
		PreparedStatement statement;
		try {
			statement = conn.prepareStatement(sql);
			statement.setInt(1,23457656);
			statement.setString(2, "Freja Hunik");
			statement.setString(3, "Jilkosvej 89");
			statement.setInt(4, 9401);
			statement.setString(5, "private");

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new customer was inserted successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}

	@Override
	public void readCustomer() {
		try {
		     
			String sql = "SELECT * FROM Customer  ";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    int phoneNumber = result.getInt("PhoneNumber");
			    String customerName = result.getString("CustomerName");
			    String customerAddress = result.getString("CustomerAddress");
			    int zipCode = result.getInt("ZipCode");
			    String customerType = result.getString("CustomerType");
			    Customer customer = new Customer(customerName, customerAddress, zipCode, phoneNumber, customerType);
			    Customer.customers.put(phoneNumber, customer);
			 
			    String output = "Customer #%d: %s - %s - %s - %s - %s";
			    System.out.println(String.format(output, ++count, phoneNumber, customerName, customerAddress, zipCode, customerType));
			}
		     
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
		
	}

	@Override
	public void readCustomerByPhoneNumber(int PhoneNumber) {
		try {
		     
			String sql = "SELECT * FROM Customer WHERE PhoneNumber ='"+PhoneNumber+"'";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    int phoneNumber = result.getInt("PhoneNumber");
			    String customerName = result.getString("CustomerName");
			    String customerAddress = result.getString("CustomerAddress");
			    int zipCode = result.getInt("ZipCode");
			    String customerType = result.getString("CustomerType");

			 
			    String output = "Customer #%d: %s - %s - %s - %s - %s";
			    System.out.println(String.format(output, ++count, phoneNumber, customerName, customerAddress, zipCode, customerType));
			}
		     
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	@Override
	public void updateCustomer() {
		try {  
			String sql = "UPDATE Customer SET PhoneNumber=?, CustomerName=?, CustomerAddress=?, ZipCode=?, CustomerType=? WHERE PhoneNumber=?";
			 
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, 11111111);
			statement.setString(2, "Petra Nina");
			statement.setString(3, "Hobrovej 2");
			statement.setInt(4, 9000);
			statement.setString(5, "private");
			statement.setInt(6, 12121212);


			 
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
			    System.out.println("An existing customer was updated successfully!");
			}
		     
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
		
	}

	@Override
	public void deleteCustomer() {
		try {
		     
			String sql = "DELETE FROM Customer WHERE PhoneNumber=?";
			 
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, 23457656);
			 
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
			    System.out.println("A customer was deleted successfully!");
			}
		     
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}		
	}
}
