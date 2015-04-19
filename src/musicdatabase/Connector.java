package musicdatabase;

import java.sql.*;

public class Connector {
    String pilot = "com.mysql.jdbc.Driver"; // Path to loading the pilot
    String databaseURL = "jdbc:mysql://localhost:3306/musicdb"; //Path to loading the database
    Connection connection;
    Statement statement;
    
    public Connector() {
        // Pilot loading
        try {
            Class.forName(pilot);
            System.out.println("Pilot successfully loaded.");
        } catch(ClassNotFoundException cnfe) {
            System.out.println(cnfe);
        }
        
        // Database connecting
        try {
            connection = DriverManager.getConnection(databaseURL, "root", "root");
            System.out.println("Connected to music database.");
        } catch(SQLException sqle) {
            System.out.println(sqle);
        }
    }
    
    public Connection getConnection() {
        return connection;
    }   
}