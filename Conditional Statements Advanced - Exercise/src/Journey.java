import java.util.Scanner;

public class Journey {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double tripPrice = 0.00;
        String tripPlace = "";
        String tripType= "";

        if(budget <=100){
            tripPlace = "Bulgaria";
            if(season.equals("summer")){
                tripPrice=budget*0.30;
                tripType = "Camp";
            } else if (season.equals("winter")) {
                tripPrice = budget*0.70;
                tripType = "Hotel";
            }

        } else if (budget > 100 && budget <= 1000) {
            tripPlace = "Balkans";
            if(season.equals("summer")){
                tripPrice=budget*0.40;
                tripType = "Camp";
            } else if (season.equals("winter")) {
                tripPrice = budget*0.80;
                tripType = "Hotel";
            }
        } else if (budget > 1000) {
            tripPlace = "Europe";
            tripPrice = budget*0.90;
            if(season.equals("summer") || season.equals("winter")){
                tripType = "Hotel";
            }
        }

        System.out.printf("Somewhere in %s\n",tripPlace);
        System.out.printf("%s - %.2f",tripType,tripPrice);

    }
}
