package Singleton.pattern;

public class DatabaseConnection implements IDatabaseConnection {
    private static volatile DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Conexão com o banco de dados estabelecida.");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executando query: " + query);
    }
}
