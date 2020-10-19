public class FacebookDecorator extends BaseDecorator {

    @Override
    public void send(String message) {
        System.out.println(message);
        sendFacebook();
    }

    public void sendFacebook(){
        System.out.println("Sent by Facebook!");
    }
}
