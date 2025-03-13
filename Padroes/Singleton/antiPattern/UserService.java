package Singleton.antiPattern;

public class UserService {
    public void getUser(int id) {
        DatabaseConnection connection = DatabaseConnection.getInstance();
        connection.executeQuery("SELECT * FROM users WHERE id = " + id);
    }
}
