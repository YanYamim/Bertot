package Singleton.pattern;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection = DatabaseConnection.getInstance();

        connection.executeQuery("SELECT * FROM users");

        DatabaseConnection anotherConnection = DatabaseConnection.getInstance();

        if (connection == anotherConnection) {
            System.out.println("As duas conexões são a mesma instância.");
        }
    }
}
