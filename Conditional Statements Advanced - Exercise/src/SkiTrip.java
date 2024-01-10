import java.util.Scanner;

public class SkiTrip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int daysOfStaying = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String stayRating = scanner.nextLine();
        double totalSum = 0.00;
        int nights = daysOfStaying -1;

        if(roomType.equals("room for one person")){
            totalSum = nights* 18.00;
        } else if (roomType.equals("apartment")) {
            if(daysOfStaying < 10){
                totalSum = (nights * 25.00) * 0.70;
            } else if (daysOfStaying > 10 && daysOfStaying <=15) {
                totalSum = (nights *25.00) * 0.65;
            } else if (daysOfStaying > 15) {
                totalSum = (nights* 25.00) * 0.50;
            }
        } else if (roomType.equals("president apartment")) {
            if(daysOfStaying < 10){
                totalSum = (nights * 35.00) * 0.90;
            } else if (daysOfStaying > 10 && daysOfStaying <=15) {
                totalSum = (nights *35.00) * 0.85;
            } else if (daysOfStaying > 15) {
                totalSum = (nights* 35.00) * 0.80;
            }
        }
        
        if(stayRating.equals("positive")){
            totalSum = totalSum*1.25;
        } else if (stayRating.equals("negative")) {
            totalSum = totalSum*0.90;
        }

        System.out.printf("%.2f",totalSum);

    }
}
