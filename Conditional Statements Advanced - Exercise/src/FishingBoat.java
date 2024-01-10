import java.util.Scanner;

public class FishingBoat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int groupBudget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersCounnt = Integer.parseInt(scanner.nextLine());
        double boatRent = 0.00;

        if(season.equals("Spring")){
            boatRent = 3000.00;
            if(fishersCounnt<=6){
                boatRent *= 0.9;
            } else if (fishersCounnt > 6 && fishersCounnt <= 11) {
                boatRent *= 0.85;
            } else if (fishersCounnt > 12) {
                boatRent*=0.75;
            }

        } else if (season.equals("Summer") || season.equals("Autumn")) {
            boatRent = 4200.00;
            if(fishersCounnt<=6){
                boatRent *= 0.9;
            } else if (fishersCounnt > 6 && fishersCounnt <= 11) {
                boatRent *= 0.85;
            } else if (fishersCounnt > 12) {
                boatRent*=0.75;
            }
        } else if (season.equals("Winter")) {
            boatRent = 2600.00;
            if(fishersCounnt<=6){
                boatRent *= 0.9;
            } else if (fishersCounnt > 6 && fishersCounnt <= 11) {
                boatRent *= 0.85;
            } else if (fishersCounnt > 12) {
                boatRent*=0.75;
            }
        }

        if(fishersCounnt%2==0 && !season.equals("Autumn")){
            boatRent *= 0.95;
        }

        double moneyDiiference = Math.abs(groupBudget-boatRent);

        if(groupBudget >= boatRent){
            System.out.printf("Yes! You have %.2f leva left.",moneyDiiference);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",moneyDiiference);
        }

    }
}
