import java.util.Scanner;

public class MatchTickets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int groupNumber = Integer.parseInt(scanner.nextLine());
        double difference = 0;
        double totalGroupPrice = 0;

        if(groupNumber >= 1 && groupNumber <= 4){

            budget *= 0.25;

        } else if (groupNumber >=5 && groupNumber <= 9) {

            budget *= 0.4;

        } else if (groupNumber >= 10 && groupNumber <= 24) {

            budget *= 0.5;

        } else if (groupNumber >= 25 && groupNumber <= 49) {

            budget *= 0.6;

        } else if (groupNumber >= 50) {

            budget *= 0.75;

        }

        if(category.equals("VIP")){

            totalGroupPrice = groupNumber * 499.99;

        } else if (category.equals("Normal")) {

            totalGroupPrice = groupNumber * 249.99;

        }

        difference = Math.abs(budget - totalGroupPrice);

        if(budget >= totalGroupPrice){

            System.out.printf("Yes! You have %.2f leva left.",difference);

        } else{

            System.out.printf("Not enough money! You need %.2f leva.",difference);

        }

    }
}
