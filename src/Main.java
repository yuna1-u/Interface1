import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Email email = new Email(scanner.nextLine());
        Sms sms = new Sms(scanner.nextInt());
        email.sendNotification();
        sms.sendNotification();


    }
}
