import java.util.Scanner;

public class YardGreening {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());
        double constantPrice = 7.61;
        double discountPercentage = 0.18;

        double priceBeforeDiscount = squareMeters*constantPrice;
        double discountAmount = discountPercentage*priceBeforeDiscount;
        double finalPrice = priceBeforeDiscount-discountAmount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discountAmount + " lv.");

    }

}
