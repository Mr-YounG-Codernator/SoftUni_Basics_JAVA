import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());

        double dogFoodConstant = 2.50;
        double catFoodConstant = 4.00;

        double totalAmount = dogFood*dogFoodConstant+catFood*catFoodConstant;

        System.out.println( totalAmount + " lv.");

    }

}
