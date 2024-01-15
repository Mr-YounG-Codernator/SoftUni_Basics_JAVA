import java.util.Scanner;

public class Travelling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while(!(destination.equals("End"))){

            double moneyNeeded = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;

            while(savedMoney < moneyNeeded){

                double sum = Double.parseDouble(scanner.nextLine());
                savedMoney += sum;

            }

            System.out.printf("Going to " + destination +"!\n");

            destination = scanner.nextLine();

        }

    }
}
