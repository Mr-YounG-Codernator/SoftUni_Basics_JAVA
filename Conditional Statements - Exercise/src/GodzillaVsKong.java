import java.util.Scanner;

public class GodzillaVsKong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double movieBudget = Double.parseDouble(scanner.nextLine());
        int massSceneActors = Integer.parseInt(scanner.nextLine());
        double outfitPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = movieBudget*0.1;

        if(massSceneActors > 150){
            outfitPrice = (massSceneActors*outfitPrice)*0.9;
        }
        else {
            outfitPrice = massSceneActors*outfitPrice;
        }


        double totalMoviePrice = outfitPrice + decorPrice;
        double moneyLeft = Math.abs(movieBudget-totalMoviePrice);

        if(totalMoviePrice > movieBudget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",moneyLeft);
        }
        else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",moneyLeft);
        }
    }
}
