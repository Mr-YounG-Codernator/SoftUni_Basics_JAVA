import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        double budgetPeter = Double.parseDouble(scanner.nextLine());
        int videoCardNumber = Integer.parseInt(scanner.nextLine());
        int processorNumber = Integer.parseInt(scanner.nextLine());
        int ramNumber = Integer.parseInt(scanner.nextLine());


        double videoCardPrice = videoCardNumber*250;
        double processorPrice = processorNumber*videoCardPrice*0.35;
        double ramPrice = ramNumber*videoCardPrice*0.1;

        double sum = videoCardPrice + processorPrice + ramPrice;

        if(videoCardNumber > processorNumber){
            sum = sum * 0.85;
        }

        double differenceMoney = Math.abs(sum-budgetPeter);

        if(sum > budgetPeter){
            System.out.printf("Not enough money! You need %.2f leva more!",differenceMoney);
        }else {
            System.out.printf("You have %.2f leva left!",differenceMoney);
        }
    }
}
   /*

        Scanner scanner = new Scanner(System.in);
        double budgetPeter = Double.parseDouble(scanner.nextLine());
        int videoCardNumber = Integer.parseInt(scanner.nextLine());
        int processorNumber = Integer.parseInt(scanner.nextLine());
        int ramNumber = Integer.parseInt(scanner.nextLine());


        double sum = videoCardNumber*250 + processorNumber*((videoCardNumber*250)*0.35) + ramNumber*((videoCardNumber*250)*0.1);

        if(videoCardNumber > processorNumber){
            sum = sum * 0.85;
        }

        double differenceMoney = Math.abs(sum-budgetPeter);

        if(budgetPeter > sum){
            System.out.printf("You have %.2f leva left!",differenceMoney);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",differenceMoney);
        }

         */