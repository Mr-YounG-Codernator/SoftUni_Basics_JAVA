import java.util.Scanner;

public class FishTank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentageOfOccupiedSpace = Double.parseDouble(scanner.nextLine());

        double volumeOfTank = (length*width*height)*0.001;
        double occupiedSpace = percentageOfOccupiedSpace/100.0;
        double volumeNeeded = volumeOfTank*(1-occupiedSpace);

        System.out.println(volumeNeeded);
    }
}
