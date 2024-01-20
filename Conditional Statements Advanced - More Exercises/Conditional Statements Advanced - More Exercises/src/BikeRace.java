import java.util.Scanner;

public class BikeRace {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int juniorRacers = Integer.parseInt(scanner.nextLine());
        int seniorRacers = Integer.parseInt(scanner.nextLine());
        String trailType = scanner.nextLine();

        double juniorPrice = 0;
        double seniorPrice = 0;
        double combinedPrice = 0;
        double totalRacers = juniorRacers + seniorRacers;
        double charity = 0;
        double organizationMoney = 0;


        if(trailType.equals("trail")){

            juniorPrice = juniorRacers * 5.50;
            seniorPrice = seniorRacers * 7;
            combinedPrice = juniorPrice + seniorPrice;

            organizationMoney = combinedPrice * 0.05;
            combinedPrice -= organizationMoney;

        } else if (trailType.equals("cross-country")) {

            juniorPrice = juniorRacers * 8;
            seniorPrice = seniorRacers * 9.50;
            combinedPrice = juniorPrice + seniorPrice;

            if(totalRacers >= 50){

                combinedPrice *= 0.75;
                organizationMoney = combinedPrice * 0.05;
                combinedPrice -= organizationMoney;

            }else {

                organizationMoney = combinedPrice * 0.05;
                combinedPrice -= organizationMoney;

            }


            
        } else if (trailType.equals("downhill")) {

            juniorPrice = juniorRacers * 12.25;
            seniorPrice = seniorRacers * 13.75;
            combinedPrice = juniorPrice + seniorPrice;

            organizationMoney = combinedPrice * 0.05;
            combinedPrice -= organizationMoney;

        } else if (trailType.equals("road")) {

            juniorPrice = juniorRacers * 20;
            seniorPrice = seniorRacers * 21.50;
            combinedPrice = juniorPrice + seniorPrice;

            organizationMoney = combinedPrice * 0.05;
            combinedPrice -= organizationMoney;

        }

        System.out.printf("%.2f",combinedPrice);

    }
}
