package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mySqlConnector implements Connector{
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String USER = "root";
    private final String PASSWORD = "1111";
    private final String JDBC_URL = "jdbc:mysql://localhost:3306/car_info?serverTimezone=UTC";


    @Override
    public Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName(DRIVER);
            connection =  DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
        } catch (ClassNotFoundException  | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
