package Databse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/QAP4";
    private static final String USER = "postgres";
    private static final String PASSWORD = "EDBB5941";

    public static Connection getConnection() throws SQLException, SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    public static void main(String[] args)
    {
        try{
            DBConnection.getConnection();
            System.out.println("Connection Successful");
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }

    }
}