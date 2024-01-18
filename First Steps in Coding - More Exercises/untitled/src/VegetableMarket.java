import java.util.Scanner;

public class VegetableMarket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double vegetablesKGPrice = Double.parseDouble(scanner.nextLine());
        double fruitKGPrice = Double.parseDouble(scanner.nextLine());
        int totalKGVegetable = Integer.parseInt(scanner.nextLine());
        int totalKGFruit = Integer.parseInt(scanner.nextLine());
        double sum;

        sum = ((vegetablesKGPrice * totalKGVegetable) + (fruitKGPrice * totalKGFruit)) / 1.94;

        System.out.printf("%.2f",sum);

    }
}
