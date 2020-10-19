public class Decarator implements BaseDecorator {
    Notifier wrapper;

    @Override
    public void BaseDecorator(Notifier notifier) {
        wrapper=notifier;
    }

    @Override
    public void send() {
        wrapper.send("Message sent");
    }
}
