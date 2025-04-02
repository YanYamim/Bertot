package Singleton.pattern;

public class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager(DatabaseType.MYSQL);
        dbManager.runQuery("SELECT * FROM users");

        DatabaseManager dbManager2 = new DatabaseManager(DatabaseType.MYSQL);
        dbManager2.runQuery("SELECT * FROM products");

        if (dbManager == dbManager2) {
            System.out.println("As duas conexões são a mesma instância (Singleton confirmado).");
        }
    }
}
