import java.util.Scanner;

public class ToyShop {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int toyTrucks = Integer.parseInt(scanner.nextLine());

        double puzzlesPrice = puzzles*2.60;
        double talkingDollsPrice = talkingDolls*3.0;
        double teddyBearsPrice = teddyBears*4.10;
        double minionsPrice = minions*8.20;
        double toyTrucksPrice = toyTrucks*2.0;

        int toysCount = puzzles + talkingDolls + teddyBears + minions + toyTrucks;
        double toysPrice = puzzlesPrice + talkingDollsPrice + teddyBearsPrice + minionsPrice + toyTrucksPrice;

        if(toysCount >= 50){
            toysPrice = toysPrice*0.75;
        }

        double rent = toysPrice*0.1;

        double leftMoney= toysPrice - rent;
        double moneyDifference = Math.abs(leftMoney-vacationPrice);

        if(leftMoney<vacationPrice){
            System.out.printf("Not enough money! %.2f lv needed.",moneyDifference);
        }
        else{
            System.out.printf("Yes! %.2f lv left.", moneyDifference );
        }
    }
}
