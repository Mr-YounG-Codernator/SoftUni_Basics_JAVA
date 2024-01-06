import java.util.Scanner;

public class Repainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylonAmountPerSqM = Integer.parseInt(scanner.nextLine());
        int paintAmountInLitters = Integer.parseInt(scanner.nextLine());
        int thinnerAmountInLitters = Integer.parseInt(scanner.nextLine());
        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        double packetPrice = 0.40;

        double totalSum = ((nylonAmountPerSqM+2)*1.50) + ((paintAmountInLitters+paintAmountInLitters*(10/100.0))*14.50) + thinnerAmountInLitters*5.00 + packetPrice;
        double builderPrice = totalSum*(30/100.0)*hoursNeeded;
        double finalPrice = builderPrice+totalSum;
        System.out.println(finalPrice);
    }
}
