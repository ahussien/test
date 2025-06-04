public class SQLServerConnection {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://<SERVER>:<PORT>;databaseName=<DB_NAME>;encrypt=true;trustServerCertificate=true";
        String username = "<USERNAME>";
        String password = "<PASSWORD>";

        try (java.sql.Connection conn = java.sql.DriverManager.getConnection(connectionUrl, username, password)) {
            System.out.println("Connected to SQL Server successfully!");
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
}
