import java.util.Scanner;

public class TransportPrice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String partOfTHeDay = scanner.nextLine();
        double sumTaxi = 0.0;
        double sumBus = 0.0;
        double sumTrain = 0.0;


        if(partOfTHeDay.equals("day")){
            if(n< 20){
                sumTaxi = 0.70 + (n * 0.79);
            } else if (n >= 20 && n < 100) {
                sumTaxi = 0.70 + (n * 0.79);
                sumBus = n * 0.09;
            } else if ( n >= 100) {
                sumTaxi = 0.70 + (n * 0.79);
                sumBus = n * 0.09;
                sumTrain = n * 0.06;
            }
        } else if (partOfTHeDay.equals("night")) {
            if(n < 20){
                sumTaxi = 0.70 + ( n*0.90);
            } else if (n >= 20 && n < 100) {
                sumTaxi = 0.70 + ( n*0.90);
                sumBus = n * 0.09;
            } else if (n >= 100) {
                sumTaxi = 0.70 + ( n*0.90);
                sumBus = n * 0.09;
                sumTrain = n * 0.06;
            }
        }

        if(n < 20){
            System.out.printf("%.2f",sumTaxi);
        } else if (n >= 20 && n < 100) {
            if(sumTaxi < sumBus){
                System.out.printf("%.2f",sumTaxi);
            }else {
                System.out.printf("%.2f",sumBus);
            }
        } else if (n >= 100) {
            if(sumTaxi < sumBus && sumTaxi < sumTrain){
                System.out.printf("%.2f",sumTaxi);
            } else if (sumBus < sumTaxi && sumBus < sumTrain) {
                System.out.printf("%.2f",sumBus);
            }
            else {
                System.out.printf("%.2f",sumTrain);
            }
        }

    }
}
