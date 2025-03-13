package Singleton.antiPattern;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection = DatabaseConnection.getInstance();
        connection.connect();
        connection.executeQuery("SELECT * FROM users");

        UserService userService = new UserService();
        userService.getUser(1);

        connection.disconnect();
    }
}
