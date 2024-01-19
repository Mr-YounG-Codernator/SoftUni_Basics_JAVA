import java.util.Scanner;

public class FlowerShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int magnoliasCount = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus  = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double magnoliaPrice = magnoliasCount * 3.25;
        double hyacinthPrice = hyacinths * 4.00;
        double rosePrice = roses * 3.50;
        double cactusPrice = cactus * 8.00;
        
        double totalSumAfterTax = (magnoliaPrice + hyacinthPrice + rosePrice + cactusPrice) * 0.95;
        double difference = Math.abs(totalSumAfterTax - giftPrice);
        
        if(totalSumAfterTax >= giftPrice){
            System.out.println("She is left with " + Math.round(Math.floor(difference)) + " leva.");
        } else if (totalSumAfterTax < giftPrice) {
            System.out.println("She will have to borrow " + Math.round(Math.ceil(difference)) + " leva.");
        }

    }
}