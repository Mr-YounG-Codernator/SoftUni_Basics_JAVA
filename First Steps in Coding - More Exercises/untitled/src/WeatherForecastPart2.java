import java.util.Scanner;

public class WeatherForecastPart2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double enteredDegree = Double.parseDouble(scanner.nextLine());

        if(enteredDegree >= 26 && enteredDegree <= 35){
            System.out.println("Hot");
        } else if (enteredDegree >= 20.1 && enteredDegree <=25.9) {
            System.out.println("Warm");
        } else if (enteredDegree >= 15 && enteredDegree <=20) {
            System.out.println("Mild");
        } else if (enteredDegree >=12 && enteredDegree <= 14.9) {
            System.out.println("Cool");
        } else if (enteredDegree >= 5 && enteredDegree <= 11.9) {
            System.out.println("Cold");
        }else {
            System.out.println("unknown");
        }

    }
}
