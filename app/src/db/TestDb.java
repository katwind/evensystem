package db;

public class TestDb {
    public static void main(String[] args) {
        DbHelper dbHelper = new DbHelper();
        dbHelper.openConnection();
        dbHelper.closeConnection();
    }
}
