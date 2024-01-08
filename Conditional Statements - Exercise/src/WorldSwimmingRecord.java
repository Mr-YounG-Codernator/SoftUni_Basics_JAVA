import java.util.Scanner;

public class WorldSwimmingRecord {

    public static void main(String[] args) {
        /*

        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double swamTime = Double.parseDouble(scanner.nextLine());

        double ivanTime = distanceInMeters*swamTime;
        double resistanceTime = (Math.floor(distanceInMeters/15))*12.5;
        double totalTime = ivanTime+resistanceTime;
        double differenceInTime = Math.abs(recordInSeconds-totalTime);

        if(recordInSeconds>totalTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.",differenceInTime);
        }

        */

        // по-кратък вариант на кода от лектора с два дабъла по-кратък, но към края има повече пресмятания и двата са по 100%

        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double swamTime = Double.parseDouble(scanner.nextLine());

        double resistanceTime = (Math.floor(distanceInMeters/15))*12.5;
        double ivanTime = distanceInMeters*swamTime + resistanceTime;

        if(recordInSeconds>ivanTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",ivanTime);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.",ivanTime-recordInSeconds);
        }
    }
}
