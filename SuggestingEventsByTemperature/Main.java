import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double temerature;
        String event;

        System.out.print("Please enter temperature: ");
        temerature = scanner.nextDouble();

        if (temerature < 5) {
            event = "Skiing is recommended";
        } else if (temerature < 15) {
            event = "Theater is recommended";
        } else if (temerature < 25) {
            event = "Barbecue is recommended";
        } else {
            event = "Swimming is recommended";
        }
        System.out.println(event);
    }
}
