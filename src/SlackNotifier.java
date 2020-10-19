public class SlackNotifier implements  Notifier {
    @Override
    public void send(String message) {
        System.out.println(message);
        sendSlack();
    }

    public void sendSlack(){
        System.out.println("Sent by slack!");
    }
}
