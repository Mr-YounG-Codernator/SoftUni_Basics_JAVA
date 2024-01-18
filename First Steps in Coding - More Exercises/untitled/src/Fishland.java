import java.util.Scanner;

public class Fishland {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double bonitoKG =Double.parseDouble(scanner.nextLine());
        double scadKG = Double.parseDouble(scanner.nextLine());
        int musselsKG = Integer.parseInt(scanner.nextLine());

        double bonitoPrice = bonitoKG * (mackerelPrice * 1.60);
        double scadPrice = scadKG * (spratPrice * 1.80);
        double musselPrice = musselsKG *7.50;

        double totalSum = bonitoPrice + scadPrice + musselPrice;

        System.out.printf("%.2f",totalSum);

    }
}
