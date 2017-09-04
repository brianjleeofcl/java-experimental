import ServerExample.ExampleHandler;
import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

import static java.lang.Integer.parseInt;

public class App {
    private static int port;

    static {
        try {
            port = parseInt(System.getenv("PORT"));
        } catch (NumberFormatException e) {
            port = 5000;
        }
    }

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/example", new ExampleHandler());
        server.setExecutor(null);
        server.start();
        System.out.printf("Server listening at port %d.%n", port);
    }
}
