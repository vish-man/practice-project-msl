package com.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.registration.model.Product;


public class ProductDao {

    public int registerProduct(Product product) throws ClassNotFoundException {
    	String INSERT_USERS_SQL = "insert into product values(?,?,?)";
//        String INSERT_USERS_SQL = "INSERT INTO product" +
//            "  (Product_Id, Product_Name, Product_Quantity, Product_Bill) VALUES " +
//            " (?, ?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/orgdata", "root", "");
//              .getConnection("jdbc:mysql://localhost:3306/orgdata?useSSL=false", "root", "");


            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, product.getProductName());
            preparedStatement.setString(3, product.getProductQuantity());
            preparedStatement.setString(4, product.getProductBill());
            
            System.out.println(preparedStatement);
            
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}