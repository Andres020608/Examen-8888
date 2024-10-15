package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    private static Connection connection;
    public static final String URL = System.getenv("DB_URL");
    public static final String USER = System.getenv("DB_USER");
    public static final String PASSWORD = System.getenv("DB_PASSWORD");

    public static Connection getConnection() {
        if (connection == null) {
            try {
                if (URL == null || USER == null || PASSWORD == null) {
                    System.out.println("Variables de ambiente de no exiten");
                }
                connection = DriverManager.getConnection(URL,USER,PASSWORD);
                //System.out.println("Conexion exitosa");
            } catch (SQLException e) {
                System.out.println("Error de conecxion" + e);
                e.printStackTrace();
            }
        }
        return connection;

    }

}
