package PSQL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLJDBC implements DBConnection {
    private final Logger logger = LoggerFactory.getLogger(PostgreSQLJDBC.class);
    private Connection DBConnection = null;

    public PostgreSQLJDBC() {
        this.logger.info("Attempting connection");
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            this.logger.error("Driver not found");
            e.printStackTrace();
        }

        this.logger.info("Driver connected");

        try {
            this.DBConnection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/testdb");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        this.logger.info("Database Connection Successful");
    }

    public boolean checkConnection() {
        return this.DBConnection != null;
    }

    public void close() {
        try {
            this.DBConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
