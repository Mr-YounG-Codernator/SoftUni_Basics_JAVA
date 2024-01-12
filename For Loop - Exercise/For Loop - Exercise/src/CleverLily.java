import java.util.Scanner;

public class CleverLily {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ageLily = Integer.parseInt(scanner.nextLine());
        double laundryPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toysCount = 0;
        int money = 10;
        double moneyCount = 0.00;
        double moneyTaken = 0.00;

        for(int i = 1; i <= ageLily; i++){

            if(i % 2 == 0){

                moneyCount += money;
                money += 10;
                moneyTaken += 1;

            }else {

                toysCount++;

            }

        }

        double sumOfBirthdayMoney = moneyCount - moneyTaken;
        double toysSum = toysCount * toyPrice;
        double sumOfBirthdayGiftsPrice = toysSum + sumOfBirthdayMoney;
        double difference = Math.abs(sumOfBirthdayGiftsPrice - laundryPrice);

        if(sumOfBirthdayGiftsPrice >= laundryPrice){

            System.out.printf("Yes! %.2f",difference);

        } else if (sumOfBirthdayGiftsPrice < laundryPrice) {

            System.out.printf("No! %.2f",difference);


        }

    }
}
