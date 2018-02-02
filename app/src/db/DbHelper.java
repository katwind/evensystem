package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    Connection connection;

    public void openConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\SQLite\\users.db");

            System.out.println("База Подключена!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void closeConnection() {
        try {
            connection.close();
            System.out.println("Соединения закрыты");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}