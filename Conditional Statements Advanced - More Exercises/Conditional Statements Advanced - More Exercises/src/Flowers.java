import java.util.Scanner;

public class Flowers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isItHoliday = scanner.nextLine();

        double price = 0;
        int totalFlowers = chrysanthemums + roses + tulips;

        if(season.equals("Spring") || season.equals("Summer")){

            if(isItHoliday.equals("Y")){

                price = (chrysanthemums * 2.00 + roses * 4.10 + tulips * 2.50) * 1.15;

            } else if (isItHoliday.equals("N")) {

                price = (chrysanthemums * 2.00 + roses * 4.10 + tulips * 2.50);

            }

            if(season.equals("Spring") && tulips > 7){

                price *= 0.95;

            }

            if(totalFlowers > 20){

                price *= 0.80;

            }


        } else if (season.equals("Autumn") || season.equals("Winter")) {

            if(isItHoliday.equals("Y")){

                price = (chrysanthemums * 3.75 + roses * 4.50 + tulips * 4.15) * 1.15;

            } else if (isItHoliday.equals("N")) {

                price = (chrysanthemums * 3.75 + roses * 4.50 + tulips * 4.15);

            }

            if(season.equals("Winter") && roses >= 10){

                price *= 0.90;

            }

            if(totalFlowers > 20){

                price *= 0.80;

            }
        }

        System.out.printf("%.2f", price +2);

    }
}
