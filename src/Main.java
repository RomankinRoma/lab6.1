import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Decarator decarator = new Decarator();
        int chose=-1;
        while (chose!=0){
            System.out.println("Send message");
            System.out.println("1.By Facebook");
            System.out.println("2.By SMS");
            System.out.println("3.By Slack");
            System.out.println("0.Exit");
            chose= in.nextInt();
            switch (chose){
                case 1:
                    System.out.println("Input message:");
                    String message=in.nextLine();
                    message=in.nextLine();
                    decarator.BaseDecorator(new FacebookNotifier());
                    decarator.send(message);
                    break;
                case 2:
                    System.out.println("Input message:");
                    message=in.nextLine();
                    message=in.nextLine();
                    decarator.BaseDecorator(new SMSNotifier());
                    decarator.send(message);
                    break;
                case 3:
                    System.out.println("Input message:");
                    message=in.nextLine();
                    message=in.nextLine();
                    decarator.BaseDecorator(new SlackNotifier());
                    decarator.send(message);
                    break;
                case 0:
                    System.out.println("Good bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect chose!");
                    break;
            }
        }
    }
}
