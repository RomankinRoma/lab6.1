public class SMSNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println(message);
        sendSMS();
    }
    public void sendSMS(){
        System.out.println("Sent by SMS");
    }
}
