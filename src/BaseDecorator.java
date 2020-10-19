public abstract class BaseDecorator implements Notifier  {
    Notifier wrapper;

    public BaseDecorator() {
        this.wrapper = wrapper;
    }

    public void BaseDecorator(Notifier notifier){
        wrapper=notifier;
    };

    public void send(String s){
        System.out.println(s);
    };
}
