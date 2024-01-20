import java.util.Scanner;

public class TruckDriver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometersPerMonth = Double.parseDouble(scanner.nextLine());

        double salary = 0;

        if(kilometersPerMonth <= 5000){

            if(season.equals("Spring") || season.equals("Autumn")){

                salary = (kilometersPerMonth * 0.75) * 4;


            } else if (season.equals("Summer")) {

                salary = (kilometersPerMonth * 0.90) * 4;

            } else if (season.equals("Winter")) {

                salary = (kilometersPerMonth * 1.05) * 4;

            }

        } else if (kilometersPerMonth > 5000 && kilometersPerMonth <= 10000) {

            if(season.equals("Spring") || season.equals("Autumn")){

                salary = (kilometersPerMonth * 0.95) * 4;


            } else if (season.equals("Summer")) {

                salary = (kilometersPerMonth * 1.10) * 4;

            } else if (season.equals("Winter")) {

                salary = (kilometersPerMonth * 1.25) * 4;

            }

        } else if (kilometersPerMonth > 10000 && kilometersPerMonth <= 20000) {

            salary = (kilometersPerMonth * 1.45) * 4;

        }

        salary *= 0.90; //after taxes 10%

        System.out.printf("%.2f",salary);
    }
}
