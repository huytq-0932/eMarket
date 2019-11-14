package main.java.vn.edu.hust.data.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String DATABASE_NAME = "emarket";
    private static final String HOST = "localhost";
    private static final String PORT = "3306";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "123456";
    private static final String URL_FORMAT = "jdbc:mysql://%s:%s/%s?autoReconnect=true&useSSL=false&characterEncoding=utf-8";

    /**
     * Connection is saved when connect with database
     */
    private static Connection connection;

    private DBConnection() {
    }

    /**
     * Create a connection with MySQL by driver
     *
     * @return a connection to the database
     * @throws SQLException the connecting with database may cause some error or fail concern with SQL
     */
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        if (connection == null) {
            String url = String.format(URL_FORMAT, HOST, PORT, DATABASE_NAME);
            connection = DriverManager.getConnection(url, USER_NAME, PASSWORD);
        }
        return connection;
    }
}
