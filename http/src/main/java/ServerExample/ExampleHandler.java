package ServerExample;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class ExampleHandler implements HttpHandler{
    public void handle(HttpExchange exchange) throws IOException {
        byte [] response = "[{\"title\":\"Brassicas\",\"desc\":\"Nathan's birthday present\",\"url\":{\"github\":\"https://github.com/brianjleeofcl/brassicas\",\"site\":\"https://cabbagecabbagecabbage.com\"},\"updated_at\":\"2017-08-23T20:37:46Z\",\"img\":\"https://cabbagecabbagecabbage.com/assets/img/butt-fumble.gif\"},{\"title\":\"Easy Forward\",\"desc\":\"IoT platform for time lapse imaging\",\"url\":{\"github\":\"https://github.com/brianjleeofcl/easy-forward\",\"site\":\"http://www.easy-fwd.com\"},\"updated_at\":\"2017-05-11T21:22:22Z\",\"img\":\"https://raw.githubusercontent.com/brianjleeofcl/easy-forward/master/readme/device.jpg\"},{\"title\":\"React Redux 2048\",\"desc\":\"react-2048, re-written with React, TypeScript & Redux\",\"url\":{\"github\":\"https://github.com/brianjleeofcl/react-redux-2048\",\"site\":\"http://react-redux-2048.herokuapp.com\"},\"updated_at\":\"2017-05-10T17:29:29Z\"},{\"title\":\"Remembify\",\"desc\":\"Todo MVC\",\"url\":{\"github\":\"https://github.com/Remembify/Remembify\",\"site\":\"https://remembify.herokuapp.com/\"},\"updated_at\":\"2017-07-20T21:22:19Z\"},{\"title\":\"Shuffle Repeat\",\"desc\":\"shuffle/repeat – a probability demonstrator\",\"url\":{\"github\":\"https://github.com/brianjleeofcl/shuffle-repeat\",\"site\":\"http://probability.brianjlee.net\"},\"updated_at\":\"2017-07-04T03:17:35Z\",\"img\":\"http://deckofcardsapi.com/static/img/AS.png\"}]".getBytes();
        Headers headers = exchange.getResponseHeaders();
        headers.add("Content-Type","application/json");
        exchange.sendResponseHeaders(200, response.length);
        OutputStream responseBody = exchange.getResponseBody();
        responseBody.write(response);
        responseBody.close();
    }
}
