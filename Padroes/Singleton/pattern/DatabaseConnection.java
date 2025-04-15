package Singleton.pattern;

public class DatabaseConnection implements IDatabaseConnection {
    private static volatile DatabaseConnection instance;

    // Impede que criem objetos com new()
    private DatabaseConnection() {
        System.out.println("Conexão com o banco de dados estabelecida.");
    }

    // Método que retorna um objeto único
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
