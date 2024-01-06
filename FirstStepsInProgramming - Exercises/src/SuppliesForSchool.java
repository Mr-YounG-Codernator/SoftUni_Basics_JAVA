import java.util.Scanner;

public class SuppliesForSchool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pencilPacket = Integer.parseInt(scanner.nextLine());
        int markerAmount = Integer.parseInt(scanner.nextLine());
        int cleanerPerLitter = Integer.parseInt(scanner.nextLine());
        int discountPercentage= Integer.parseInt(scanner.nextLine());

        double discountPrice = ((pencilPacket*5.80)+(markerAmount*7.20)+(cleanerPerLitter*1.20))*(discountPercentage/100.0);
        double totalPrice =  ((pencilPacket*5.80)+(markerAmount*7.20)+(cleanerPerLitter*1.20));
        double finalPrice = totalPrice-discountPrice;
        System.out.println(finalPrice);
    }
}
