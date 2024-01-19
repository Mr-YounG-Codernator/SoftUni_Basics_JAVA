import java.util.Scanner;

public class PipesInPool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double P1InHours = h * P1;
        double P2InHours = h * P2;
        double sumOfP1AndP2 = P1InHours + P2InHours;
        double volumeDifference =Math.abs(V - sumOfP1AndP2);

        double percentageOfVolume = (sumOfP1AndP2 / V) * 100;
        double percentageP1 = (P1InHours / sumOfP1AndP2) * 100;
        double percentageP2 = (P2InHours / sumOfP1AndP2) * 100;


        if(V < sumOfP1AndP2){
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",h,volumeDifference);
        } else if (V >= sumOfP1AndP2) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",percentageOfVolume,percentageP1,percentageP2);
        }

    }
}
