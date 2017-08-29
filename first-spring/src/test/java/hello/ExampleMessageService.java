package hello;

public class ExampleMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Example String!";
    }
}
