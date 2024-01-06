import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double menuPrices = chickenMenu*10.35 + fishMenu*12.40 + vegetarianMenu*8.15;
        double dessertPrice = menuPrices*(20/100.0);
        double deliveryPrice = 2.50;

        double totalPrice = menuPrices+dessertPrice+deliveryPrice;

        System.out.println(totalPrice);

    }
}
