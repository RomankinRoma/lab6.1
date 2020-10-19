public class FacebookDecorator extends BaseDecorator {

    @Override
    public void send(String message) {
     super.send(message);
        sendFacebook();
    }

    public void sendFacebook(){
        System.out.println("Sent by Facebook!");
    }
}
