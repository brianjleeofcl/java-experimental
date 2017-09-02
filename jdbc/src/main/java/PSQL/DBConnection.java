package PSQL;

public interface DBConnection {
    void close();
    boolean checkConnection();
}
