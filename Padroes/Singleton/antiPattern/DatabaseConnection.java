package Singleton.antiPattern;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String connectionString;
    private boolean isConnected;

    private DatabaseConnection() {
        this.connectionString = "jdbc:mysql://localhost:3306/mydb";
        this.isConnected = false;
        System.out.println("Conexão com o banco de dados estabelecida.");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Conectado ao banco de dados.");
        }
    }

    public void disconnect() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Desconectado do banco de dados.");
        }
    }

    public void executeQuery(String query) {
        if (isConnected) {
            System.out.println("Executando query: " + query);
        } else {
            System.out.println("Erro: Não conectado ao banco de dados.");
        }
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
}
