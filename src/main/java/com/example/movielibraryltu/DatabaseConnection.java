package com.example.movielibraryltu;
import java.sql.*;

public class DatabaseConnection {
    static String name = "";
    static String bookNames = "";
    static Connection conn = null;
    static Statement st = null;

    public static void connect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/LibraryMovieDatabase"; // Replace with your database URL
        String username = "root"; // Replace with your MySQL username
        String password = "T3ams0t1s!"; // Replace with your MySQL password

        // Establishing the connection
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    }






