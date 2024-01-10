import java.util.Scanner;

public class NewHouse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice =0.00;

        if(flowerType.equals("Roses")){
            if(flowerCount > 80){
                totalPrice=(flowerCount*5.00)*0.9;
            }else{
                totalPrice = flowerCount*5.00;
            }
        } else if (flowerType.equals("Dahlias")) {
            if(flowerCount > 90){
                totalPrice=(flowerCount*3.80)*0.85;
            }else{
                totalPrice = flowerCount*3.80;
            }
        }else if (flowerType.equals("Tulips")) {
            if(flowerCount > 80){
                totalPrice=(flowerCount*2.80)*0.85;
            }else{
                totalPrice = flowerCount*2.80;
            }
        }else if (flowerType.equals("Narcissus")) {
            if(flowerCount < 120){
                totalPrice=(flowerCount*3.00)*1.15;
            }else{
                totalPrice = flowerCount*3.00;
            }
        }else if (flowerType.equals("Gladiolus")) {
            if(flowerCount < 80){
                totalPrice=(flowerCount*2.50)*1.20;
            }else{
                totalPrice = flowerCount*2.50;
            }
        }

        double moneyDifference = Math.abs(budget-totalPrice);
        if(budget >= totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowerCount,flowerType,moneyDifference);
        }
        else {
            System.out.printf("Not enough money, you need %.2f leva more.",moneyDifference);
        }

    }
}
