public class SlackDecorator extends BaseDecorator {
    @Override
    public void send(String message) {
        super.send(message);
        sendSlack();
    }

    public void sendSlack(){
        System.out.println("Sent by slack!");
    }
}
