import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String stayingPlace = "";
        String location = "";

        if(budget <= 1000){

            stayingPlace = "Camp";

            if(season.equals("Summer")){

                location = "Alaska";
                budget *= 0.65;

            } else if (season.equals("Winter")) {

                location = "Morocco";
                budget *= 0.45;

            }

        } else if (budget > 1000 && budget <= 3000) {

            stayingPlace = "Hut";

            if(season.equals("Summer")){

                location = "Alaska";
                budget *= 0.80;

            } else if (season.equals("Winter")) {

                location = "Morocco";
                budget *= 0.60;

            }

        } else if (budget > 3000) {

            stayingPlace = "Hotel";

            if(season.equals("Summer")){

                location = "Alaska";
                budget *= 0.90;

            } else if (season.equals("Winter")) {

                location = "Morocco";
                budget *= 0.90;

            }
        }

        System.out.printf("%s - %s - %.2f",location, stayingPlace, budget);

    }
}
