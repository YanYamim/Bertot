package Singleton.pattern;

public class DatabaseManager {
    private IDatabaseConnection connection;

    public DatabaseManager(DatabaseType dbType) {
        switch (dbType) {
            case MYSQL:
            case POSTGRESQL:
            case ORACLE:
            case SQLSERVER:
                this.connection = DatabaseConnection.getInstance();
                break;
            default:
                throw new IllegalArgumentException("Tipo de banco de dados não suportado.");
        }
    }

    public void runQuery(String query) {
        connection.executeQuery(query);
    }
}
