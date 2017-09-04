import PSQL.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private final static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        DBConnection db = new PostgreSQLJDBC();
        if (db.checkConnection()) {
            log.info("connection maintained");
        } else {
            log.info("connection is not maintained");
        }
        db.insertTable("Examples");


        db.close();
    }
}
